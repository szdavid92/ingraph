package ingraph.cypher2relalg

import ingraph.antlr.CypherLexer
import ingraph.antlr.CypherParser
import ingraph.antlr.CypherParser.CypherContext
import ingraph.cypher2relalg.cypherlisteners.RelalgCypherListener
import java.io.File
import java.util.Collections
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.apache.commons.io.FileUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import relalg.Container

class RelalgParser {

	def static parseFile(String queryName) {
		val filepath = "../queries/" + queryName + ".cyp"
		val query = FileUtils.readFileToString(new File(filepath), "UTF-8")
		parse(query)
	}	
	
	def static parse(String query) {
		println(query)
		println
		
		val input = new ANTLRInputStream(query)
		val lexer = new CypherLexer(input)
		val tokenStream = new CommonTokenStream(lexer)
		val parser = new CypherParser(tokenStream)

		val CypherContext cypher = parser.cypher()

		val listener = new RelalgCypherListener()
		ParseTreeWalker.DEFAULT.walk(listener, cypher)

		println("Vertex labels:    " + listener.vertexLabelFactory.elements.entrySet.map[key.toString].join(", "))
		println("Vertex variables: " + listener.vertexVariableFactory.elements.entrySet.map[key.toString].join(", "))
		println()
		println("Edge labels:    " + listener.edgeLabelFactory.elements.entrySet.map[key.toString].join(", "))
		println("Edge variables: " + listener.edgeVariableFactory.elements.entrySet.map[key.toString].join(", "))
		println()

		return listener.container
	}

	def static save(Container container, String filename) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("relalg", new XMIResourceFactoryImpl());

		val resourceSet = new ResourceSetImpl
		val uri = URI.createFileURI(filename + ".relalg")
		val resource = resourceSet.createResource(uri)
		resource.contents.add(container)
		resource.save(Collections.emptyMap)
		
		return container
	}

}

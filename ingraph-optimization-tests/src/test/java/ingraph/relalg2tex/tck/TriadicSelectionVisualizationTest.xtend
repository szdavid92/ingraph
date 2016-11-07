package ingraph.relalg2tex.tck

import org.junit.Test

import ingraph.cypher2relalg.Cypher2Relalg
import ingraph.relalg.util.SchemaInferencer
import ingraph.relalg2tex.RelalgTreeSerializer

class TriadicSelectionVisualizationTest {

    val RelalgTreeSerializer serializer = new RelalgTreeSerializer
    extension SchemaInferencer inferencer = new SchemaInferencer
    
    /*
    Scenario: Handling triadic friend of a friend
    Given the binary-tree-1 graph
    */
    @Test
    def void testTriadicSelection_01() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b)-->(c)
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_01")
    }

    /*
    Scenario: Handling triadic friend of a friend that is not a friend
    Given the binary-tree-1 graph
    */
    @Test
    def void testTriadicSelection_02() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b)-->(c)
        OPTIONAL MATCH (a)-[r:KNOWS]->(c)
        WITH c WHERE r IS NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_02")
    }

    /*
    Scenario: Handling triadic friend of a friend that is not a friend with different relationship type
    Given the binary-tree-1 graph
    */
    @Test
    def void testTriadicSelection_03() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b)-->(c)
        OPTIONAL MATCH (a)-[r:FOLLOWS]->(c)
        WITH c WHERE r IS NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_03")
    }

    /*
    Scenario: Handling triadic friend of a friend that is not a friend with superset of relationship type
    Given the binary-tree-1 graph
    */
    @Test
    def void testTriadicSelection_04() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b)-->(c)
        OPTIONAL MATCH (a)-[r]->(c)
        WITH c WHERE r IS NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_04")
    }

    /*
    Scenario: Handling triadic friend of a friend that is not a friend with implicit subset of relationship type
    Given the binary-tree-1 graph
    */
    @Test
    def void testTriadicSelection_05() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-->(b)-->(c)
        OPTIONAL MATCH (a)-[r:KNOWS]->(c)
        WITH c WHERE r IS NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_05")
    }

    /*
    Scenario: Handling triadic friend of a friend that is not a friend with explicit subset of relationship type
    Given the binary-tree-1 graph
    */
    @Test
    def void testTriadicSelection_06() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS|FOLLOWS]->(b)-->(c)
        OPTIONAL MATCH (a)-[r:KNOWS]->(c)
        WITH c WHERE r IS NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_06")
    }

    /*
    Scenario: Handling triadic friend of a friend that is not a friend with same labels
    Given the binary-tree-2 graph
    */
    @Test
    def void testTriadicSelection_07() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b:X)-->(c:X)
        OPTIONAL MATCH (a)-[r:KNOWS]->(c)
        WITH c WHERE r IS NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_07")
    }

    /*
    Scenario: Handling triadic friend of a friend that is not a friend with different labels
    Given the binary-tree-2 graph
    */
    @Test
    def void testTriadicSelection_08() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b:X)-->(c:Y)
        OPTIONAL MATCH (a)-[r:KNOWS]->(c)
        WITH c WHERE r IS NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_08")
    }

    /*
    Scenario: Handling triadic friend of a friend that is not a friend with implicit subset of labels
    Given the binary-tree-2 graph
    */
    @Test
    def void testTriadicSelection_09() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b)-->(c:X)
        OPTIONAL MATCH (a)-[r:KNOWS]->(c)
        WITH c WHERE r IS NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_09")
    }

    /*
    Scenario: Handling triadic friend of a friend that is not a friend with implicit superset of labels
    Given the binary-tree-2 graph
    */
    @Test
    def void testTriadicSelection_10() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b:X)-->(c)
        OPTIONAL MATCH (a)-[r:KNOWS]->(c)
        WITH c WHERE r IS NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_10")
    }

    /*
    Scenario: Handling triadic friend of a friend that is a friend
    Given the binary-tree-2 graph
    */
    @Test
    def void testTriadicSelection_11() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b)-->(c)
        OPTIONAL MATCH (a)-[r:KNOWS]->(c)
        WITH c WHERE r IS NOT NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_11")
    }

    /*
    Scenario: Handling triadic friend of a friend that is a friend with different relationship type
    Given the binary-tree-1 graph
    */
    @Test
    def void testTriadicSelection_12() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b)-->(c)
        OPTIONAL MATCH (a)-[r:FOLLOWS]->(c)
        WITH c WHERE r IS NOT NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_12")
    }

    /*
    Scenario: Handling triadic friend of a friend that is a friend with superset of relationship type
    Given the binary-tree-1 graph
    */
    @Test
    def void testTriadicSelection_13() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b)-->(c)
        OPTIONAL MATCH (a)-[r]->(c)
        WITH c WHERE r IS NOT NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_13")
    }

    /*
    Scenario: Handling triadic friend of a friend that is a friend with implicit subset of relationship type
    Given the binary-tree-1 graph
    */
    @Test
    def void testTriadicSelection_14() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-->(b)-->(c)
        OPTIONAL MATCH (a)-[r:KNOWS]->(c)
        WITH c WHERE r IS NOT NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_14")
    }

    /*
    Scenario: Handling triadic friend of a friend that is a friend with explicit subset of relationship type
    Given the binary-tree-1 graph
    */
    @Test
    def void testTriadicSelection_15() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS|FOLLOWS]->(b)-->(c)
        OPTIONAL MATCH (a)-[r:KNOWS]->(c)
        WITH c WHERE r IS NOT NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_15")
    }

    /*
    Scenario: Handling triadic friend of a friend that is a friend with same labels
    Given the binary-tree-2 graph
    */
    @Test
    def void testTriadicSelection_16() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b:X)-->(c:X)
        OPTIONAL MATCH (a)-[r:KNOWS]->(c)
        WITH c WHERE r IS NOT NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_16")
    }

    /*
    Scenario: Handling triadic friend of a friend that is a friend with different labels
    Given the binary-tree-2 graph
    */
    @Test
    def void testTriadicSelection_17() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b:X)-->(c:Y)
        OPTIONAL MATCH (a)-[r:KNOWS]->(c)
        WITH c WHERE r IS NOT NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_17")
    }

    /*
    Scenario: Handling triadic friend of a friend that is a friend with implicit subset of labels
    Given the binary-tree-2 graph
    */
    @Test
    def void testTriadicSelection_18() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b)-->(c:X)
        OPTIONAL MATCH (a)-[r:KNOWS]->(c)
        WITH c WHERE r IS NOT NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_18")
    }

    /*
    Scenario: Handling triadic friend of a friend that is a friend with implicit superset of labels
    Given the binary-tree-2 graph
    */
    @Test
    def void testTriadicSelection_19() {
        val container = Cypher2Relalg.processString('''
        MATCH (a:A)-[:KNOWS]->(b:X)-->(c)
        OPTIONAL MATCH (a)-[r:KNOWS]->(c)
        WITH c WHERE r IS NOT NULL
        RETURN c.name
        ''')
        container.addSchemaInformation
        serializer.serialize(container, "tck/TriadicSelection_19")
    }

}
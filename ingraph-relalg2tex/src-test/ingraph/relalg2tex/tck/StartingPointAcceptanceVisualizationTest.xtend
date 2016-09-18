package ingraph.relalg2tex.tck

import org.junit.Test

import ingraph.cypher2relalg.RelalgParser
import ingraph.relalg2tex.RelalgTreeSerializer

class StartingPointAcceptanceVisualizationTest {

    val RelalgTreeSerializer serializer = new RelalgTreeSerializer
    
    /*
    Scenario: Find all nodes
    Given an empty graph
    And having executed:
      """
      CREATE ({name: 'a'}),
             ({name: 'b'}),
             ({name: 'c'})
      """
    */
    @Test
    def void testStartingPointAcceptance_01() {
        val container = RelalgParser.parse('''
        MATCH (n)
        RETURN n
        ''')
        serializer.serialize(container, "StartingPointAcceptance_01")
    }

    /*
    Scenario: Find labelled nodes
    Given an empty graph
    And having executed:
      """
      CREATE ({name: 'a'}),
             (:Person),
             (:Animal),
             (:Animal)
      """
    */
    @Test
    def void testStartingPointAcceptance_02() {
        val container = RelalgParser.parse('''
        MATCH (n:Animal)
        RETURN n
        ''')
        serializer.serialize(container, "StartingPointAcceptance_02")
    }

    /*
    Scenario: Find nodes by property
    Given an empty graph
    And having executed:
      """
      CREATE ({prop: 1}),
             ({prop: 2})
      """
    */
    @Test
    def void testStartingPointAcceptance_03() {
        val container = RelalgParser.parse('''
        MATCH (n)
        WHERE n.prop = 2
        RETURN n
        ''')
        serializer.serialize(container, "StartingPointAcceptance_03")
    }

}
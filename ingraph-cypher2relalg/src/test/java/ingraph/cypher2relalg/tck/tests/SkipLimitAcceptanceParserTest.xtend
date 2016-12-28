package ingraph.cypher2relalg.tck.tests

import ingraph.cypher2relalg.Cypher2Relalg
import ingraph.cypher2relalg.tck.FailingTests
import ingraph.cypher2relalg.tck.RegressionTests
import ingraph.cypherparser.CypherParser
import ingraph.cypherparser.CypherUtil
import org.junit.Test
import org.junit.experimental.categories.Category

class SkipLimitAcceptanceParserTest {
    
    /*
    Scenario: SKIP with an expression that does not depend on variables
    And having executed:
      """
      UNWIND range(1, 10) AS i
      CREATE ({nr: i})
      """
    */
    @Test
    @Category(FailingTests)
    def void testSkipLimitAcceptance_01() {
        val cypher = CypherParser.parseString('''
        MATCH (n)
        WITH n SKIP toInteger(rand()*9)
        WITH count(*) AS count
        RETURN count > 0 AS nonEmpty
        ''')
        CypherUtil.save(cypher, "../ingraph-cypxmi/tck/SkipLimitAcceptance_01")
        Cypher2Relalg.processCypher(cypher)
    }

    /*
    Scenario: LIMIT with an expression that does not depend on variables
    And having executed:
      """
      UNWIND range(1, 3) AS i
      CREATE ({nr: i})
      """
    */
    @Test
    @Category(FailingTests)
    def void testSkipLimitAcceptance_02() {
        val cypher = CypherParser.parseString('''
        MATCH (n)
        WITH n LIMIT toInteger(ceil(1.7))
        RETURN count(*) AS count
        ''')
        CypherUtil.save(cypher, "../ingraph-cypxmi/tck/SkipLimitAcceptance_02")
        Cypher2Relalg.processCypher(cypher)
    }

}
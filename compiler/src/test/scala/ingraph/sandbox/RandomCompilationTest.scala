package ingraph.sandbox

class RandomCompilationTest extends CompilerTest {
  override val config = CompilerTestConfig(querySuitePath = None
    , compileQPlanOnly = true
    , skipQPlanResolve = false
    , skipQPlanBeautify = false
    , printQuery = false
    , printCypher = true
    , printQPlan = true
    , printJPlan = false
    , printFPlan = false
  )

  test("Random test from cypher string") {
    compile(
      """MATCH (segment:Segment)
        |WHERE NOT NOT NOT (segment.length > 0)
        |RETURN segment, segment.length AS length
        |     , case segment.length when +0 then 'zero' when --+-1 then 'almost OK' else 'too bad' end AS lengthComment""".stripMargin)

  }

  test("Random double edge variable in the same MATCH") {
    compile(
      """MATCH
        |  (a)-[e]->(b),
        |  (a)-[e]->(b)
        |RETURN a, e, b""".stripMargin)

  }

  test("Random double edge variable in separate MATCHes") {
    compile(
      """MATCH (a)-[e]->(b)
        |MATCH (a)-[e]->(b)
        |RETURN a, e, b""".stripMargin)

  }

  test("Random: no edge variable in pattern") {
    compile(
      """MATCH (a)
        |OPTIONAL MATCH (a)-->(b)
        |WHERE 1=2
        |RETURN b""".stripMargin
    )
  }

  ignore("Random: create w/ vertex and edge properties") {
    compile(
      """CREATE (:Foo {a: 23, b: 'bar'})-[:FooEdge {a:11, c:'edge'}]->(:Foo2), (:Foo3)
        |RETURN 1 AS one""".stripMargin
    )
  }

  test("Random: vertex pattern with property map") {
    compile(
      """MATCH (n {id: "n1"})
        |WHERE n.length=1
        |RETURN n""".stripMargin
    )
  }

  ignore("Random: create after match") {
    compile(
      """MATCH (n:Foo)
        |CREATE (n)-[:Bar]->(m:Foo2)-[:Bar2]->(o:Foo3)
        |RETURN n, m""".stripMargin
    )
  }

  ignore("Random: various expressions") {
    compile(
      """MATCH (segment:Segment), (foo:Foo), (bar:Bar)
        |WHERE 1=1
        |  AND segment.name STARTS WITH 'alibaba'
        |  AND 'rablo' ENDS WITH segment.name
        |  AND 'mese' CONTAINS 'uveghegy'
        |  AND segment.length <= 0
        |  AND 2<3
        |  AND NOT 1=1
        |  OR 0=1
        |  OR 1=1
        |  AND sin(3)+4*2^6 > segment.length
        |  AND sin(segment.length) > 2
        |  AND segment.length IS NULL
        |RETURN DISTINCT *, sum(segment.width) as w, segment as l, [1, segment.length, cos(3)] as list, count(*) as ize
        |ORDER BY 2+3 DESC, l.width ASC""".stripMargin
    )
  }

  test("Random: expression IS NULL") {
    compile(
      """MATCH (n:Person)
        |WHERE n.name IS NULL
        |RETURN n, n.name""".stripMargin
    )
  }

  test("Random: expression IS NOT NULL") {
    compile(
      """MATCH (n:Person)
        |WHERE n.name IS NOT NULL
        |RETURN n, n.name""".stripMargin
    )
  }
}
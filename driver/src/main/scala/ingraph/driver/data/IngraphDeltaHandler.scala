package ingraph.driver.data

import hu.bme.mit.ire.datatypes.Tuple
import hu.bme.mit.ire.listeners.ChangeListener
import org.neo4j.driver.v1.Record
import scala.collection.JavaConverters._

abstract class IngraphDeltaHandler() extends ChangeListener {
  val keys : Vector[String]
  val repackager = new Repackager(keys)

  def onChange(positiveRecords: java.util.List[_ <: Record], negativeRecords: java.util.List[_ <: Record])

  final override def listener(positive: Iterable[Tuple], negative: Iterable[Tuple]): Unit = {

    val positiveRecords: java.util.List[_ <: Record] = repackager.repackageResult(positive)
    val negativeRecords: java.util.List[_ <: Record] = repackager.repackageResult(negative)
    onChange(positiveRecords, negativeRecords)
  }
}

class PrintDeltaHandler(override val keys : Vector[String]) extends IngraphDeltaHandler {
  override def onChange(positiveRecords: java.util.List[_ <: Record], negativeRecords: java.util.List[_ <: Record]): Unit = {
    positiveRecords.asScala.foreach(p => println(s"-$p"))
    negativeRecords.asScala.foreach(n => println(s"-$n"))
  }
}

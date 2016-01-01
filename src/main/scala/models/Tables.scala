package models

import com.github.aselab.activerecord._
import com.github.aselab.activerecord.dsl._
import com.github.aselab.activerecord.scalatra._

/**
 * Table definition.
 */
object Tables extends ActiveRecordTables with ScalatraSupport with InitialData {
  lazy val words = table[Word]("words")
}

trait InitialData extends ActiveRecordTables {
  override def initialize {
    super.initialize
  }
}

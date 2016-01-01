package models

import com.github.aselab.activerecord._
import com.github.aselab.activerecord.dsl._

/**
 * Word model.
 *
 * @param name
 */
case class Word (
  @Required
  name: String
) extends ActiveRecord

object Word extends ActiveRecordCompanion[Word]

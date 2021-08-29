package com.qbrainx.model

final case class TrainingStudent(id:String, fName:String, LName:String)
object TrainingStudent{

  def apply(tupleParam: (String, String, String)): TrainingStudent =
    tupleParam match {
      case (id, fName, lName) => apply(id, fName, lName)
    }
}
package com.qbrainx.repository.imp


import com.qbrainx.repository.TrainingStudentRepository
import com.qbrainx.config.SlickConfig
import com.qbrainx.model.TrainingStudent
import com.qbrainx.repository.imp.TrainingStudentRepositoryImp.schema
import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile
import slick.jdbc.{JdbcBackend, JdbcProfile}

import java.security.PrivateKey
import scala.concurrent.Future

final class TrainingStudentRepositoryImp extends TrainingStudentRepository{
import SlickConfig.jdbcProfile.api._
  val db=SlickConfig.db
private val query: TableQuery[schema] =TableQuery(new schema(_))
 override def insert(trainingStudent: TrainingStudent):Future[Int]=db.run(query+=trainingStudent)
}
object TrainingStudentRepositoryImp{

  import SlickConfig.jdbcProfile.api._
  val tableName="trainingStudents"
  final class schema(tag:Tag) extends Table[TrainingStudent](tag,tableName) {
    private def id=column[String]("id",O.PrimaryKey)
    private def fName=column[String]("fName")
    private def lName=column[String]("lName")
    override def * = (id,fName,lName)<>(TrainingStudent.apply,TrainingStudent.unapply)
  }
}
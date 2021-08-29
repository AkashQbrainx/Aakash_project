package com.qbrainx.app

import com.qbrainx.config.SlickConfig
import com.qbrainx.model.TrainingStudent
import com.qbrainx.repository.TrainingStudentRepository
import com.qbrainx.repository.imp.TrainingStudentRepositoryImp
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object App extends scala.App {
 val trainingStudentRepositoryImp:TrainingStudentRepository=new TrainingStudentRepositoryImp
 trainingStudentRepositoryImp.insert(TrainingStudent("1","Aakash","akashy")).onComplete{
   case Success(value)=>println(value)
   case Failure(exception)=>exception.printStackTrace
 }


}

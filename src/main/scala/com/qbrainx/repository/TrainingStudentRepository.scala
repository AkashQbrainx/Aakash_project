package com.qbrainx.repository

import com.qbrainx.model.TrainingStudent

import scala.concurrent.Future

trait TrainingStudentRepository {
  def insert(trainingStudent: TrainingStudent):Future[Int]

}

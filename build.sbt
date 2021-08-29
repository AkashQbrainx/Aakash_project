import Dependencies._
name := "slick-practice"

version := "0.1"

scalaVersion := "2.13.6"

organization:="com.qbrainx"

organizationName := "QBrainX"

organizationHomepage :=Some(url("https://www.qbrainx.com/#"))

description:= "A project to explain the working of slick"

libraryDependencies ++=compileDependencies ++ testDependencies.map(_%Test)
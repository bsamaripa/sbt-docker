name := "example-auto-package"

organization := "sbtdocker"

version := "0.1.0"

scalaVersion := "2.11.5"

enablePlugins(DockerPlugin)

dockerAutoPackageJavaApplication()

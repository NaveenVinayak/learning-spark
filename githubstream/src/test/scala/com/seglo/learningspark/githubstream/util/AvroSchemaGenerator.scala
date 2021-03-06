package com.seglo.learningspark.githubstream.util

import com.gensler.scalavro.types.AvroType
import com.seglo.learningspark.githubstream.GitHubEvent

/**
 * I use this as a convenience call to generate Avro schema's from Scala case classes.
 * https://github.com/GenslerAppsPod/scalavro
 */
object AvroSchemaGenerator {
  def main (args: Array[String]) {
    val s = AvroType[GitHubEvent].schema()
    println(s)
  }
}
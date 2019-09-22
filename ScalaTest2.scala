package ScalaTest2

object ScalaTest2 extends App {
  println("steve is a sponge")
  println("command line arguments are:")
  println(args.mkString(", "))


  import scala.io.Source
  val fileContents = Source.fromFile("ScalaTest.txt").getLines.mkString

  val bufferedSource = Source.fromFile("ScalaTest.txt")
  for (line <- bufferedSource.getLines) {
    println(line.toUpperCase)
  }

  bufferedSource.close

}

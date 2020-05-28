import io.Source._

object readFromFiles extends App {
  var fileName = "src/rainbow.txt"
  for(line <- fromFile(fileName).getLines()) {
    println(line.toUpperCase())
  }
  val poemLines = fromFile("scr/poem.txt").getLines().toList
  poemLines.foreach(println)
}
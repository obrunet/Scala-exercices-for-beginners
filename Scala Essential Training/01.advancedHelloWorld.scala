object HelloWorld {
  def main(args: Array[String]): Unit = {
    // this is my 1st scala program https://scastie.scala-lang.org/
    print("Hello Scala !\n")
    /*
     * declare variables
     */
    val firstName: String = "Gertrude"
    var age: Int = 21
    age = age + 10
    print(firstName + ", is \n" + age + " years old\n")
    var sum = 10 + 
      25 +
      35
    print(sum)
    
    def firstFunction: Unit = {
      println("\nThis is my first function !")
    }
    
    firstFunction
  }
}
object challOne {
  def main(args: Array[String]): Unit = {
    
    def addFunc(a: Int, b: Int) = a + b

    val const: Double = 10.5
    def substractFunc(a: Int, b: Int) = {
      a - b + const
    }

    val testOne = addFunc(10, 20)
    println(testOne)

    var testTwo = substractFunc(10, 20)
    println(testTwo)
  }
}
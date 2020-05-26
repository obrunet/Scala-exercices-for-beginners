object funcExamples {
  
  def abs(x: Int) = if(x < 0) -x else x
  println(abs(-15))
  println(abs(7))
  
  
  def fac(x: Int) = {
    var r = 1
    for(i <- 1 to x)
      r = r * i
    r
  }
  println(fac(5))
  
  
  def recursiveFac(x: Int): Int = if(x <= 0) 1 else x * recursiveFac(x-1)
  println(recursiveFac(5))
  
  
  def printName(firstName: String, lastName: String): Unit = {
    println(firstName + " " + lastName)
  }
  printName(lastName="Obama", firstName="Barack")
  printName("without", "param")
  
  
  def printLeftName(left: String = "[", firstName: String, lastName: String): Unit = {
    println(left + firstName + " " + lastName)
  }
  printName(lastName="Michel", firstName="Obama")
  
  
  def sum(args: Int*) = {
    var result = 0
    for(arg <- args) result += arg
    result
  }
  println(sum(1, 2, 3, 4, 5))
}

funcExamples
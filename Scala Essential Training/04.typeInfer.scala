object typeInference {
  val num = 5
  val decimal = 5.265
  var x = 1 + 2 * 3.5
  List(1, 2, 4.2)
  List(1, true)
  List(1, true, "string")
  println(num)
  
  def addOne(x: Int) = x + 1
  def funcOne(x: Int) = if(x>0) 1 else "negative"
  // beware of recursive functions : the compiler is not able to infer type
}
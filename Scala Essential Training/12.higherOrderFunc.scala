object higherOrderFunc {
  println("welcome to higer odrer func")
  
  val double = (i: Int) => i * 2
  
  def higherOrder(x: Int, y: Int => Int) = y(x)
  // y is a func

  println(higherOrder(6, double))
  
  val triple = (i: Int) => i * 3
  println(higherOrder(8, triple))
  
  
  def sayHello = (name: String) => {"Hello" + " " + name}
  // returns a func
  var message = sayHello("Barack Obama")
  println(message)
  
  
  //a closure
  var y = 5
  val multiplier = (x: Int) => x * y
  //y is declare outside the func 
  println(multiplier(10))
}

higherOrderFunc
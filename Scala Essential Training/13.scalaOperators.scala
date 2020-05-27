object operatorExample {
  println("welcome to this operator example worksheet")
  
  var x = 3
  var y = 9
  var sum = x + y
  var b1 = x & y
  var b2 = x | y
  var b3 = x^y
  var b4 = x<<2

  val nums = 1::3::5::Nil

  var msg = if(x>0 || y>0) "Both values are positive"
  
  print(sum, b1, b2, b3, b4, nums, msg)
  // (12,1,11,10,12,List(1, 3, 5),Both values are positive)
}

operatorExample
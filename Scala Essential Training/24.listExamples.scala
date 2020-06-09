object listExamples {

  // processed like arrays but unlike they cannot be changed using an assignment 
  var l = List(3.0, 5, "a", 'b')
  var m = 1::2::3::3::4::5::Nil
  var n = List.range(10, 20)
  
  println(l)      // List(3.0, 5, a, b)
  println(m)      // List(1, 2, 3, 3, 4, 5)
  println(n)      // List(10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
  
  var o = l:::m
  println(o)      // List(3.0, 5, a, b, 1, 2, 3, 3, 4, 5)
  
  var sum = 0
  n.foreach(sum += _)
  println(sum)    // 145
  
  val list = List((1, 2), (3, 4), (5, 6))
  var test = for((a, b) <- list) yield a+b
  println(test)   // List(3, 7, 11)
}

listExamples

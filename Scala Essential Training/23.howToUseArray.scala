object arrayExample {
  
  // array is set to a fix size, it's ordered
  var nums = new Array[Any](10)
  
  // no need to specify new if it's initialized
  var furniture = Array("chair", "sofa", "table", "bed")
  
  for(f <- furniture) println(f)
  println("----\n")
  println(furniture(0))
  println(furniture(3))
  
  var a = Array(1, 2, 3, 4, 5, 6, 7, 8)
  var result = for(n <- a) yield 2*n
  for(r <- result) println(r)
  
  println("----\n")
  var even = for(n <- a if n%2 == 0) yield n
  for(e <- even) println(e)
  
}

arrayExample
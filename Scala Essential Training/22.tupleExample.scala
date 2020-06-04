object tupleExamples {
  
  val v = (1, 1.4, "Hello")
  val x = v._3
  println(x)                      // Hello
  
  val (first, second, third) = v
  println(first, third)           // (1,Hello)
  
  val symbols = Array("<", "-", ">")
  val counts = Array(2, 10, 2)
  val pairs = symbols.zip(counts)       
  // Array[(String, Int)] = Array((<, 2), (-, 10), (>, 2))
  
  println(pairs)
  
  for((s, n)<- pairs) print(s * n)
  println // still in buffer <<---------->>
  
  def divideBy10(n: Int): Tuple2[Int, Int] =
    (n/10, n%10)
  
  val (tens, ones) = divideBy10(99)
  println(tens, ones)             // (9,9)
  
}

tupleExamples
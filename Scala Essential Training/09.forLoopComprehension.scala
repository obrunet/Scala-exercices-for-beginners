object loopsPractice {
  var y = for(num <- 10 to 0 by -1) yield num + 1
  println(y) // Vector(11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
}

loopsPractice
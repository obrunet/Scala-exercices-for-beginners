object setExamples {
  
  val fruit = Set("apple", "orange", "banana")
  var moreFruit = Set("kiwi", "pineapple")
  var nums = Set(1, 2, 3, 4, 5)
  var moreNums = Set(6, 7, 8, 9)
  
  //if(nums.contains(5)) println("5 is indeed in the set nums")
  println(nums.contains(5))     // true
  println(nums(5))              // true
  println(nums.contains(6))     // false
  println(nums(6))              // false
  
  var mixed = fruit ++ nums
  println(mixed)                // HashSet(5, banana, 1, orange, 2, 3, apple, 4)
  
  nums -= 5
  println(nums)                 // HashSet(1, 2, 3, 4)
  
  println(nums & moreNums )     // HashSet()
  
  println(moreFruit.head)       // kiwi
  println(moreFruit.tail)       // Set(pineapple)
  
  println(moreNums.isEmpty)     // false

}

setExamples
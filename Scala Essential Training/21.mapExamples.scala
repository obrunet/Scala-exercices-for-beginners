object mapExamples {
  
  var groceries = Map(1->"milk", 2->"bread", 3->"juice", 4->"eggs")
  groceries = groceries+(5->"hashbrowns")
  
  println(groceries.get(3))       // Some(juice)
  println(groceries(3))           // juice
  
  println(groceries.getOrElse(6, "No Match"))           // "No Match"

  for(v <- groceries.values) println(v)
  
  // reverse the key-values pairs
  var z = for((k, v)<- groceries) yield (v, k)
  println(z)                                            // HashMap(eggs -> 4, milk -> 1, hashbrowns -> 5, juice -> 3, bread -> 2)
}

mapExamples
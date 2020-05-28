object decisionExample {
  println("welcome to this decision statement worksheet")
  
  var today = "Monday"
  if(today == "Monday") println("It might rain")
  if(today == "Tuesday") println("It will not rain")
  else println("What's the weather today")
  
  var b = 5
  var a = if(b<0) -1 else 1
  println(a)
  
  b = -1
  println(if(b<0) "-" else if(b==0) "0" else "+")

  var rate = 10.50
  def earnings(s: String, h: Double): String = {
    if(s != "y"){
      if(h <= 40)
        "Salary is: $" + h * rate
      else{"Salary is: $" + (40 * rate + (h-40) * rate * 1.5) }
    }
    else "This is a salaried employee"
  }
  
  println(earnings("n", 30))
  println(earnings("n", 45))
  println(earnings("y", 40))

}

decisionExample

/*
welcome to this decision statement worksheet
It might rain
What's the weather today
1
-
Salary is: $315.0
Salary is: $498.75
This is a salaried employee
*/
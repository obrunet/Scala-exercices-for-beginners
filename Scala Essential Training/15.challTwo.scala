object challTwo {
  println("welcome to this 2nd challenge")
  // write code for a payroll function
  // calculate the weekly paycheck for an hourly employee
  var rate = 10.50
  
  // Check if employee is hourly or salaried before calculation
  def earnings(name: String, emp: String, hrs: Int) = {
    if(emp == "hourly") {
      if(hrs<=10) name + " is an hourly employe, his/her weekly paycheck" + hrs * rate
      else name + " is an hourly employe, his/her weekly paycheck" + ((10 * rate) + (hrs - 40) * rate * 1.5)
    }   
    else name + " is a salaried employee"
  } 

  //var empOne = ("Gustave", "hourly", 30)
  println(earnings("Gustave", "hourly", 30))
  println(earnings("Maximus", "hourly", 50))
  println(earnings("Robert", "salaried", 20))

}

challTwo
object payroll {
  var e1 = new Employee("Sam", "Paulson")
  var e2 = new Employee("Doris", "Jones", salaried = 's')
  println(e1)
  println(e2)
}

class Employee(val fName: String, val lName: String, var salaried: Char = 'n') {
  
  def fullName: String = fName + " " + lName
  
  override def toString = "\nEmployee name: " + fullName +
  (if(salaried == 'n') "\nHourly Employee" else "\nSalaried Employee") +
  ("\n" + "="*20)
}

payroll
// singleton object only have one instance
// here of the controller for the employee ID

object payroll {
  var e1 = new Employee("Sam", "Paulson")
  var e2 = new Employee("Doris", "Jones", salaried = 's')
  var e3 = new Employee("James", "Brown")
  println(e1)
  println(e2)
  println(e3)
}

class Employee(val fName: String, val lName: String, var salaried: Char = 'n') {
  
  def fullName: String = fName + " " + lName
  
  var employeeID = Employee.newEEID()
  
  override def toString = "\nEmployee name: " + fullName + 
  "\nEmployee ID: " + employeeID +
  (if(salaried == 'n') "\nHourly Employee" else "\nSalaried Employee") +
  ("\n" + "="*20)
}

object Employee {
  var employeeID = 0
  def newEEID() = { employeeID += 1
      employeeID
  }
}

payroll
package com.knoldus.db
import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class Employees {
  val emp : Employee = Employee("Aditya","Narayan",22,5000,"Intern","Knoldus","aditya.narayan@knoldus.com")
  val emp1 : Employee = Employee("Adi","Mishra",21,5000,"Intern","Knoldus","adi.mishra@knoldus.com")
  val totalEmp : HashMap[String,Employee] = HashMap("emp1"->emp,"emp2"->emp1)
}

//to create  constructor of employees class to initialize employees data
public class EmployeeAttributes{
//Declare employee attributes
int empID;
String empName;
 double empSalary;
//Constructor to initialize employee data
EmployeeAttributes(int id, String name, double salary){
empID=id;
empName=name;
empSalary=salary;
}
//Method to display employee details
void displayEmployeeDetails() {
System.out.println("employee Id: "+empID);
System.out.println("employee name: "+empName);
System.out.println("employee salary: "+empSalary);
}
public static void main (String[]args) {
//create an object of constructor class and initialize employee data using constructor
EmployeeAttributes emp1=new EmployeeAttributes(101,"Abcde",60000);
//call method to display employee details
emp1.displayEmployeeDetails();
}
}

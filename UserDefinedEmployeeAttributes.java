//to create  constructor of employees class to initialize employees data
import java.util.Scanner;
public class UserDefinedEmployeeAttributes{
//Declare employee attributes
int empID;
String empName;
double empSalary;
//Constructor to initialize employee data
 UserDefinedEmployeeAttributes(int id, String name, double salary){
empID=id;
empName=name;
empSalary=salary;
}
//Method to display employee details
void displayEmployeeDetails(){
System.out.println("employee Id: "+empID);
System.out.println("employee name: "+empName);
System.out.println("employee salary: "+empSalary);
}
public static void main (String[]args) {
//create an object of constructor class and initialize employee data using constructor
Scanner sc= new Scanner(System.in);
System.out.println("enter Employee ID:");
int id=sc.nextInt();
sc.nextLine();
System.out.println("enter employee name:");
String name=sc.nextLine();
System.out.println("enter Employee salary:");
double salary=sc.nextDouble();
// cretae object with proper variale name 
EmployeeAttributes emp1=new EmployeeAttributes(id,name,salary);
//call method to display employee details
emp1.displayEmployeeDetails();
sc.close();
}
}

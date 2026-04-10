//take input from user to calculate the value 
import java.util.Scanner // scanner used to take input from user
public class SmplCalctr{
    //method1: Addition
    public static int add(int a,int b){
        //store value in c variable
        c=a+b;
     return c;
    }
        //method 2 :subtraction
        public static int Subtract(int a,int b){
            //store value in c variable
         c=a-b;
   return c;
        }
       //method 3:Multiplication
        public static int Multiply(int a,int b){
            //store value in c variable
       c=a*b;
  return c; 
         }
      //method 4:Division
      public static int divide(int a,int b){
          //store value in c variable
        c=a/b;
   return c;
           }
     public static void main (String [] args){
     //take two number  from user
    Scanner sc= new Scanner(System.in);
    System.out.println("eter two number");
    int num1 = sc.nextInt(); // first number
        int num2 = sc.nextInt(); // second number
     //call method and print result
       System.out.println("Addition of " +num1 +" "+"and " +num2 +" is"+" "+add(num1,num2));
       System.out.println("Subtraction of " +num1 +" "+"and " +num2 +" is"+" "+Subtract(num1,num2));
       System.out.println("Addition of " +num1 +" "+"and " +num2 +" is"+" "+Multiply(num1,num2));
       System.out.println("Addition of " +num1 +" "+"and " +num2 +" is"+" "+divide(num1,num2));
       sc.close();
    }
    }

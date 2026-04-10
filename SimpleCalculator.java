public class SimpleCalculator{
    //method1: Addition
    public static int add(int a,int b){
        return a+b;
    }
        //method 2 :subtraction
        public static int Subtract(int a,int b){
        return a-b;
    }
       //method 3:Multiplication
        public static int Multiply(int a,int b){
        return a*b;
    }
      //method 4:Division
      public static int divide(int a,int b){
        return a/b;
    }
     public static void main (String [] args){
     //declare teo variable
     int num1=0;
     int num2=1;
     //call method and print result
       System.out.println("Addition of " +num1 +" "+"and " +num2 +" is"+" "+add(num1,num2));
       System.out.println("Subtraction of " +num1 +" "+"and " +num2 +" is"+" "+Subtract(num1,num2));
       System.out.println("Addition of " +num1 +" "+"and " +num2 +" is"+" "+Multiply(num1,num2));
       System.out.println("Addition of " +num1 +" "+"and " +num2 +" is"+" "+divide(num1,num2));
    }
    }

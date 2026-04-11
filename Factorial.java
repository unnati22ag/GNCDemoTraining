\\find factorial of entered no.
import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
         System.out.println("enter a no.:");
         int number = sc.nextInt();
         long fact= 1;
           for(int=1;i<=number;i++){
            factorial*=i;
           }
           System.out.println("Factorial of " + number + " is: " + factorial);
            sc.close();
          }
}




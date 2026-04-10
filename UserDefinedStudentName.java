// Program: Userdefined student name 
// shows length, uppercase, and lowercase
import java.util.Scanner;
public class UserDefinedStudentName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student name: ");
        String studentName=sc.nextLine(); // take student name form user 
        // character length
        int length = studentName.length();
        System.out.println("Character length is: " + length);
        // upper case
        String upperCase = studentName.toUpperCase();
        System.out.println("UpperCase is: " + upperCase);
       // lower case
        String lowerCase = studentName.toLowerCase();
        System.out.println("LowerCase is: " + lowerCase);
    }
}

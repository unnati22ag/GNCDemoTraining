// Program: Predefined student name 
// shows length, uppercase, and lowercase

public class PreDefinedStudentName {
    public static void main(String[] args) {
        String studentName = "coding"; // predefined student name

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

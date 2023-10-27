package homeowork_week_6;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme_9_ConverUpperToLowerCase {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConverUpperToLowerCase t = new Programme_9_ConverUpperToLowerCase();
        t.convertUppercaseToLowerCase(uppercase);
        // closing the scanner object
        scanner.close();
    }

    //Conversion of Uppercase to Lower case method
    public void convertUppercaseToLowerCase(String text) {
        System.out.println("The Lowercase value is =" + text.toLowerCase());
    }
}
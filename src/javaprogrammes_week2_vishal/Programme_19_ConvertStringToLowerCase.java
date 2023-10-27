package javaprogrammes_week2_vishal;

import java.util.Scanner;

/*
Write java program to convert a given string to lowercase.
Sample Input : THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output : the quick brown fox jumps over the lazy dog
 */
public class Programme_19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Uppercase sentence");
        String upperCase = scanner.nextLine();
        Programme_19_ConvertStringToLowerCase t = new Programme_19_ConvertStringToLowerCase();
        t.convertStringToLowerCase(upperCase);
//closing scanner object
        scanner.close();
    }

    // Convert string the lower case
    public void convertStringToLowerCase(String str) {
        System.out.println("The Lowercase of the String is = " + str.toLowerCase());
    }


}

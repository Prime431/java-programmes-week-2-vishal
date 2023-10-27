package javaprogrammes_week2_vishal;

import java.util.Scanner;

/*
Write a Java program to convert a decimal number to binary number.
input Data:
Input a Decimal Number : 5
Expectd Output
Binary nunber is : 101
 */
public class Programme_17_DecimalToBinary {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        System.out.println("Welcome to Java program ro convert decimal to binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter decimal number");
        int number = scanner.nextInt();
        convertdecimalToBinary(number);
        //Closing the scanner object
        scanner.close();
    }

    // Conversing the decimal to binary
    public static void convertdecimalToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is :" + binary);
    }
}


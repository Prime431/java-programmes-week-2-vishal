package javaprogrammes_week2_vishal;

import java.util.Scanner;

//Write a programme to calculate the area of Triangle.
public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {


        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the height of the triangle");
        int height = scanner.nextInt();
        int length = scanner.nextInt();
        System.out.println("Please enter the height of the triangle : ");
        areaOfTriangle(height, length);
        // closing the scanner object
        scanner.close();
    }

    //Calculating the area of triangle with no return type with parameter method
    public static void areaOfTriangle(int length, int height) {
        int area = (length * height) / 2;
        System.out.println("The area of a triangle is :" + area);
    }
}
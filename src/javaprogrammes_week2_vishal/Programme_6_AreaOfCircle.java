package javaprogrammes_week2_vishal;

import java.util.Scanner;

/*
Write program to enter any radios value of the circle and find out the area. (Formula of Area A=PI*r*r).
 */
public class Programme_6_AreaOfCircle {

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius");
        double redius = scanner.nextDouble();
        areaOfCircle(redius);
        // closing the scanner object
        scanner.close();
    }
// Calculating the area of circle
    public static void areaOfCircle(double radius){
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area of Circle is: " + area);
    }
}

package week7_newhomework;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */

public class Programme_6_AreaOfCircle {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = scan.nextDouble();
       areaOfcircle(radius);
        //closing the scanner object
        scan.close();
    }
    //calculating the area of circle
    public static void areaOfcircle(double radius){
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The area of circle : " + area);
    }
}

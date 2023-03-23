package week7_newhomework;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */

public class Programme_9_ConvertUpperToLowerCase {

    public static void main(String[] args) {
        //scanner declaction
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase String :");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUppercaseToLowercase(uppercase);
        //closing scanner
        scanner.close();
    }
    //conversion of uppercase to lower case method
    public void convertUppercaseToLowercase(String text){
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}

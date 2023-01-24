package Homework01072022;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        /*6)Write a program to find largest number among
        three numbers using nested if provided by a user (numbers must be distinct)*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int number1= input.nextInt();
        int number2= input.nextInt();
        int number3= input.nextInt();

        if (number1>number2) {
            if (number1>number3) {
                System.out.println("Largest number is "+number1);
            }
        }

        if (number2>number1) {
            if (number2>number3) {
                System.out.println("Largest number is "+number2);
            }

            if (number3>number2) {
                if (number3>number1) {
                    System.out.println("Largest number is "+number3);
                }

            }

        }
    }
}

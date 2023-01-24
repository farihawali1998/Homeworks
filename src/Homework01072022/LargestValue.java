package Homework01072022;

import java.util.Scanner;

public class LargestValue {
    public static void main(String[] args) {
        /*5) Write a program to find largest of three double values using
    if-else..if and logical operators provided by a user (numbers must be distinct)*/

        Scanner input=new Scanner (System.in);
        System.out.println("Enter 3 different numbers");
        double number1= input.nextDouble();
        double number2=input.nextDouble();
        double number3=input.nextDouble();

        if (number1>number2 && number1>number3) {
        System.out.println("Largest number is "+number1);
    } else if (number2>number1 && number2>number3)  {
            System.out.println("Largest number is "+number2);
        } else if (number3>number1 && number3>number2) {
            System.out.println("Largest number is "+number3);

        }

    }
    }

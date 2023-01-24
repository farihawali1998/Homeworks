package Homework01072022;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter first number");
        double num1=input.nextDouble();

        System.out.println("Enter second number");
        double num2=input.nextDouble();

        System.out.println("Enter an operator");
        String operator= input.next();

        if (operator.equals("+")) {
        System.out.println(num1+num2);
    } else if (operator.equals("-")) {
            System.out.println(num1-num2);
        } else if (operator.equals("*")) {
            System.out.println(num1*num2);
        } else if (operator.equals("/")) {
            System.out.println(num1/num2);
        }

    }
    }

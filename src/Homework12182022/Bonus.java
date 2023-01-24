package Homework12182022;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many years have you worked?");
        int year = input.nextInt();

        if (year >= 5) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("You are eligible for bonus. How much was your salary?");
            int salary= input.nextInt();

            if (salary>50000) {
                System.out.println("Your bonus is 5000");
            } else {
                System.out.println("Your bonus is 3000");
            }
        } else {
            System.out.println("You are not eligible for bonus");


        }
    }
}

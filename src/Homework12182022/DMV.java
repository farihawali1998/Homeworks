package Homework12182022;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("What is your age?");
        int age=input.nextInt();

        if (age>=18) {
            System.out.println("Drivers license will be issued");
        } else {
            System.out.println("You can get driver's permit");

        }
    }
}

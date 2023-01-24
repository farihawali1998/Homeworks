package Homework12182022;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("How much loan do you need?");
        int loan= input.nextInt();

        if (loan <= 200000) {
            System.out.println("The loan is granted");

        } else {
            System.out.println("The loan is rejected");
        }
    }
}

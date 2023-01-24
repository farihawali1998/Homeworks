package Homework12182022;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        Boolean Creditcard = input.nextBoolean();

        if (Creditcard == true) {
            Scanner input2 = new Scanner(System.in);
            System.out.println("What is your card balance?");
            int balance = input2.nextInt();

            if (balance > 1000) {
                System.out.println("You should pay off your loan");
            } else {
                System.out.println("You can keep spending");
            }

        } else {
            System.out.println("We can offer you a credit card");
        }
    }
}


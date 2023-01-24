package Homework01142023;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        /*
        Create a program that will be asking user to apply for a credit card 10 times. 
        As soon you get an “yes” from a user program should stop asking.
        * */
        for (int i = 0; i <=10 ; i++) {

            Scanner input= new Scanner(System.in); {
                System.out.println("Do you want a credit card?");
                String consent= input.nextLine();

                if (consent.equals("yes")) {
                    break;
                }
            }
        }
    }
}

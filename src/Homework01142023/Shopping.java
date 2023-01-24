package Homework01142023;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        /*Write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        If user give more money program should return a change.
        Whenever a user done with payments program should say "Thank you for shopping!"*/

        double totalprice= 0;

        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter items you want to buy with its price");
            String item=input.nextLine();
            double price=input.nextInt();
        totalprice=totalprice+price;
        }
        System.out.println("Please pay for the items");
        double paidprice=input.nextDouble();

        if (totalprice>paidprice) {
            System.out.println("Please pay the rest " + (totalprice-paidprice));
        } else if (totalprice<paidprice) {
            System.out.println("Here is your change "+(paidprice-totalprice));
        } else {
            System.out.println("Thank you for your shopping");
        }
    }
}

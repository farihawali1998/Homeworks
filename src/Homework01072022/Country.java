package Homework01072022;

import java.util.Scanner;

public class Country {
    public static void main(String[] args) {
       // 7) Ask user to enter their country and capture it. Once values are captured print which language user speaks.

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your country");
        String country= input.nextLine();
       /* String country2= input.nextLine();
        String country3= input.nextLine();
        String country4= input.nextLine();
        String country5= input.nextLine();*/

        if (country.equals("Afghanistan")) {
            System.out.println("You speak Dari");
        } else if (country.equals("Pakistan")) {
            System.out.println("You speak Urdu");
        } else if (country.equals("China")) {
            System.out.println("You speak Chineese");
        } else if (country.equals("Turkey")) {
            System.out.println("You speak Turkish");
        } else if (country.equals("USA")) {
            System.out.println("You speak English");

        }
    }
}

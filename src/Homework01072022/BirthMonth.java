package Homework01072022;

import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        /*4)Write a program for user to enter his/hers birth month. Based on the month define the season.
                Example: if user is born in June, July or August → season =”Summer”.
        At the end of the program we should see output as “You were born __”.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month = input.nextLine();

        if (month.equals("January") || month.equals("February") || month.equals("December")) {
            System.out.println("you were born in winter");
        } else if (month.equals("March") || month.equals("April") || month.equals("May")) {
            System.out.println("you were born in spring");
        } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
            System.out.println("You were born in summer");
        } else if (month.equals("September") || month.equals("October") || month.equals("December"))
                System.out.println("You were born in autumn");
        }
}

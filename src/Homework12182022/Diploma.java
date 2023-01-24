package Homework12182022;

import java.util.Scanner;

public class Diploma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a degree?");
        boolean diploma = input.nextBoolean();

        if (diploma == true) {

            System.out.println("Congratulations");

            Scanner input2 = new Scanner(System.in);
            System.out.println("How much is your GPA");
            double GPA = input2.nextDouble();

            if (GPA >= 3.5) {
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should have worked harder");
            }
        } else {
            System.out.println("You should get a degree");
        }
    }
}









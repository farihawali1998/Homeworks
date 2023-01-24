package Project;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not?
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= input.nextInt();

        if (number/number==1){
            System.out.println("The number is a prime number");
        } else {
            System.out.println("The number is not a prime number");
        }
    }
}

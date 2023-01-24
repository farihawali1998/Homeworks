package Homework01142023;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        /*
        Write a program that reads a range of integers (start and end point),
        provided by a user and then from that range prints the sum of the even and odd integers.
        * */
        Scanner input=new Scanner(System.in);
        System.out.println("Insert start of number range:");
        int num1=input.nextInt();
        System.out.println("Insert end of the range: ");
        int num2=input.nextInt();

        int evensum=0;
        int oddsum=0;

        for (int i = num1; i < num2; i++) {
            if (i%2==0) {
                evensum +=i;
            } else {
                oddsum+=i;
            }
        }
        System.out.println("Sum of odd numbers of range is "+oddsum);
        System.out.println("Sum of even numbers of range is "+evensum);

    }
}

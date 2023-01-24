package Homework01072022;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        /*3) Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F*/

        Scanner input=new Scanner(System.in);
        System.out.println("Enter quiz score");
        int quiz= input.nextInt();

        System.out.println("Enter midterm score");
        int midterm=input.nextInt();

        System.out.println("Enter final scores");
        int finalscore=input.nextInt();

        if ((float)(quiz+midterm+finalscore)/2>=90) {
            System.out.println("grade A");
        } else if ((float)(quiz+midterm+finalscore)/2>=70) {
            System.out.println("grade B");
        } else if ((float)(quiz+midterm+finalscore)/2<=70) {
            System.out.println("grade C");
        } else if ((float)(quiz+midterm+finalscore)/2<50) {
            System.out.println("grade F");
        }
    }
}

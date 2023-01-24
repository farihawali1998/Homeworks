package Project;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


      Scanner input=new Scanner(System.in);
        System.out.println("Please enter five numbers");
        int [] numbers= new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = input.nextInt();
        }
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum= numbers [i] + sum;
        }
        System.out.println("The total of numbers are equal to "+sum);
    }
}

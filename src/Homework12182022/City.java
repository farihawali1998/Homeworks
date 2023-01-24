package Homework12182022;

import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your city name?");
        String name= input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println ("What is the temperature in your city in Forenheit?");
        int temperature=input2.nextInt();
        temperature= (temperature-32)*5/9;
        System.out.println("The temperature in your city is "+temperature+" Celsius");
    }
}

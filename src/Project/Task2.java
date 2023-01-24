package Project;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Using Scanner create an array of countries. When an array is created,retrieve all values
        //from it and while retrieving those values print capital for each country. (use 2 different loops).
        Scanner input=new Scanner(System.in);
        String [] countries = {"Afghanistan","USA","India","Pakistan","Germany"};
        String [] capitals= {"Kabul", "Washington","Delhi","Islamabad", "Berlin"};
        for (int i = 0; i < countries.length; i++) {
                System.out.println("The capital of "+countries[i] +" is "+capitals[i]);
        }

        System.out.println("***********");
        Scanner scanner=new Scanner(System.in);
        String [] countries1 = {"Afghanistan","USA","India","Pakistan","Germany"};
        String [] capitals1= {"Kabul", "Washington","Delhi","Islamabad", "Berlin"};
        int k=0;
        while (k<countries.length){
            System.out.println("The capital of "+countries[k] +" is "+capitals[k]);
            k++;
        }
    }
}

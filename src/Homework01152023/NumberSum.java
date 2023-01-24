package Homework01152023;

public class NumberSum {
    public static void main(String[] args) {
        /*Create an array of size 5 on integers and calculate the sum of all elements in an array.*/

        int [] numbers= {1,2,3,4,5};

        int sum=0;
        for (int i = 0; i <=5 ; i++) {
            sum=sum+numbers[i];
            System.out.println(sum);
        }
    }
}

package Project;

public class Task8 {
    public static void main(String[] args) {
        //8)Write a Java Program to print the first 10 numbers of Fibonacci series.
        int n = 10;
        int[] fibonacci = new int[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}

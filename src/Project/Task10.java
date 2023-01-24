package Project;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        //10)Write a java program to find the second largest number in the array?

        int [] arr= {38,98,10,22,90,11};
        Arrays.sort(arr);
        System.out.println("The second largest number is "+arr[arr.length-2]);
    }
}

package Project;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        //9)Maximum and minimum number in the array?

        int [] arr = {38,98,10,22,90,11};
        Arrays.sort(arr);
        System.out.println("Minimum value is "+arr[0]);
        System.out.println("Maximum value is "+arr[arr.length-1]);
    }
}

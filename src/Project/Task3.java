package Project;

public class Task3 {
    //Create a 2D array of integer values. Print the sum of all numbers.
    public static void main(String[] args) {
        int[][] numbers = {{2, 3, 5, 3},
                {9, 2, 4, 3},
                {1, 2, 3, 4}};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum = numbers[i][j] + sum;
            }
        }
        System.out.println(sum);
    }
}


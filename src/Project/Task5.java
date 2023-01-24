package Project;

public class Task5 {
    public static void main(String[] args) {
        //Create a 2D array of integers.
        // Develop a program which will calculate the sum of  even and odd numbers for that array.

        int [][] numbers= {{1,3,4,5,6,7},
                {4,9,8,2,1},
                {9,8,3,2}};
        int sumeven=0;
        int sumodd=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0) {
                    sumeven+=numbers[i][j];

                } else if (numbers[i][j]!=2){
                    sumodd+=numbers[i][j];

                }
            }
        }
        System.out.println("The total of even numbers are "+ sumeven);
        System.out.println("The total of odd numbers are "+sumodd);
    }
}

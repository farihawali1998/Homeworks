package Homework12182022;

public class Mortgage {
    public static void main(String[] args) {
        double rate= 4.3;
        int price= 250000;

        if (rate>4.5) {
            System.out.println("User will not buy the house");
        } else {
            System.out.println("User will buy the house");
            if (price > 200000) {
                System.out.println("User will take a loan");
            } else {
                System.out.println("User will pay cash");
            }
        }
    }
}

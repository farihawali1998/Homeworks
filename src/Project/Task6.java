package Project;

public class Task6 {
    public static void main(String[] args) {
        //Write a program to swap 2 numbers without a temporary variable?

        int x=90; int y=84;
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("int x:"+x);
        System.out.println("Int y:"+y);
    }
}

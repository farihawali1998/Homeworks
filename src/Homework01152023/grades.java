package Homework01152023;

public class grades {
    public static void main(String[] args) {
        /*
        ) Create an array of chars and store grades into it: A,B,C,D,E,F.
        Then print a grade B (use 2 different ways of creating an array).
        */

        String [] chars= {"A","b","c","d","e","f"};
        System.out.println(chars[1]);

        System.out.println("**************");

        String [] chars2= new String[5];
        chars2 [0]= "A";
        chars2 [1]= "b";
        chars2 [2]= "c";
        chars2 [3]= "d";
        chars2 [4]= "e";
        chars2 [5]= "f";

    }
}

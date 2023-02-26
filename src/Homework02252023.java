package Homework02252023;

import java.util.LinkedHashSet;

public class Homework02252023 {
    public static void main(String[] args) {
        //Create a set of cities in which you want to make sure
        //that insertion order is maintained. Then remove any city
        //that starts with "A".

        LinkedHashSet<String> countries=new LinkedHashSet<>();
        countries.add("Afghanistan");
        countries.add("Pakistan");
        countries.add("Azerbijan");
        countries.add("India");

        countries.removeIf(x-> x.startsWith("A"));
        System.out.println(countries);

    }
}

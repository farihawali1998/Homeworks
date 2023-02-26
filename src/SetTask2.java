package Homework;

import java.util.HashSet;

public class SetTask2 {

    String type;
    String name;
    String ID;

    public SetTask2(String type, String name, String ID) {
        this.type = type;
        this.name = name;
        this.ID = ID;
    }

    void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        /*Create a Set collection that will hold objects of
         * student type. In this set we do not care about the insertion
         * order. Each student object should have name and studentID
         * Display name of each student. */

        HashSet<SetTask2> student = new HashSet<>();
        student.add(new SetTask2("College", "Fariha", "KD123"));
        student.add(new SetTask2("School", "Arsh", "ik123"));

        for (SetTask2 s : student) {
            s.printName();

        }
    }
}

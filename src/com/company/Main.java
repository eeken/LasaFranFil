package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {

        ObjectIOExample objectIO = new ObjectIOExample();

        /*Student student1 = new Student("jaså","minsann",22);
        Student student2 = new Student("ola","wiebe",23);*/
        ArrayList<Student> students = new ArrayList<>();
        /*students.add(student1);
        students.add(student2);
        objectIO.WriteObjectToFile("studentlist.txt", students);*/

        //Read object from file
        students = (ArrayList<Student>) objectIO.ReadObjectFromFile("studentlist.txt");
        System.out.println(students);
    }
}

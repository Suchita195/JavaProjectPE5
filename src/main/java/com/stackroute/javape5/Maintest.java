package com.stackroute.javape5;

import java.util.ArrayList;
import java.util.List;

public class Maintest {
    public List<Student> maintest(Student student1,Student student2,Student student3,Student student4,Student student5) {
        //creating an array list and adding information of the students
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        //sorting the arraylist
        list.sort(new StudentSorter());

        return list;


    }
}

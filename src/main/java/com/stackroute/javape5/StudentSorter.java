package com.stackroute.javape5;

import java.util.Comparator;

    public class StudentSorter implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            if (s1.getAge() == s2.getAge()) {
                if (s1.getName().equals(s2.getName())) {
                    return s2.getId() - s1.getId();//if age and name of two students is same
                } else {
                    return s2.getName().compareTo(s1.getName());//if age is same but name is different of two students
                }

            } else {
                return s2.getAge() - s1.getAge();//if age is different of two students
            }
        }
    }


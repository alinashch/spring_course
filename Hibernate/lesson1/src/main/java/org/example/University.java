package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {
    private List<Student> studentList=new ArrayList<>();

    public void addStudent(){
        Student s1=new Student("qqq", 2, 4.2);
        Student s2=new Student("www", 4, 3.2);
        studentList.add(s1);
        studentList.add(s2);
    }

    public List<Student> getStudentList() {
        System.out.println("getStudentList start");
        System.out.println(studentList.get(3));
        System.out.println(studentList);
        return studentList;
    }
}

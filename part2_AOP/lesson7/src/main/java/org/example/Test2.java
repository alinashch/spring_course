package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);

        University university=context.getBean("university", University.class);
        university.addStudent();
        List<Student> students=university.getStudentList();
        System.out.println(students);
        context.close();

    }
}

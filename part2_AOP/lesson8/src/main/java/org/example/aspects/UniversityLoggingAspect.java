package org.example.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.example.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
/*
    @Before("execution (* getStudentList())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice");
    }

    @AfterReturning(pointcut= "execution (* getStudentList())" , returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
        Student s1=students.get(0);
        String name=s1.getName();
        name="Mr. "+name;
        s1.setName(name);

        double avgGrade=s1.getAvgGrade();
        avgGrade+=(double)10;
        s1.setAvgGrade(avgGrade);

        System.out.println("afterReturningGetStudentsLoggingAdvice");
    }

 */

    @AfterThrowing(pointcut =  "execution (* getStudentList())", throwing ="exception" )
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){

        System.out.println("afterThrowingGetStudentsLoggingAdvice" +exception);
    }

}

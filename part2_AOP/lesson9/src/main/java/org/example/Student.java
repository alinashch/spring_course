package org.example;

import org.springframework.core.annotation.Order;

public class Student {
    private String name;
    private int course;
    private double avgGrade;

    public Student(String name, int course, double avgGrade) {
        this.name = name;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    @Override
    public  String toString(){
        return "Student"+ name+ course+avgGrade;
    }
}

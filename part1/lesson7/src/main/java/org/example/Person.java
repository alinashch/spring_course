package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public void callPet(){
        System.out.println("Hello");
        pet.say();
    }

    @Autowired
    public Person(Pet pet){
        this.pet=pet;
    }


    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

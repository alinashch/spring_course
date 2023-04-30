package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    @Qualifier("dog")
    private Pet pet;
    @Value("wwwww")
    private String surname;

    private int age;

    public Person() {
        System.out.println("Created Person without pet");
    }

    //При наличии более одного подходящего bean'а при помощи аннотации
    //@Qualifier("<bean>") может указать какой именно bean необходим для внедрении зависимости.

    public void setPet(Pet pet) {
        System.out.println("class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }
    @Value("${person.age}")
    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
}
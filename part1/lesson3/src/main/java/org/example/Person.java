package org.example;

public class Person {
    private Pet pet;


    public void callPet(){
        System.out.println("Hello");
        pet.say();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

}

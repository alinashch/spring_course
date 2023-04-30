package org.example;

public class Dog implements Pet {
    private String name;
    @Override
    public void say(){
        System.out.println("Bow-Bow");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

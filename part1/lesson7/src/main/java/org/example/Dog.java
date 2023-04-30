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

    private void init() {
        System.out.println("Class dog: init method");
    }

    private void destroy() {
        System.out.println("Class dog: destroy method");
    }
}

package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Dog implements Pet {
    private String name;
    public Dog() {
        System.out.println("Dog bean is created");
    }
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

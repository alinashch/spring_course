package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog=context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);
        myDog.setName("1");
        yourDog.setName("2");
        System.out.println(myDog+" "+ myDog.getName());
        System.out.println(yourDog+ " "+ yourDog.getName());
    }
}

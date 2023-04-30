package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(MyConfig.class);
        Pet cat=context.getBean("catBean",Pet.class );
        Pet cat1=context.getBean("catBean",Pet.class );
        System.out.println(cat);
        System.out.println(cat1);
        cat.say();
        Person person=context.getBean("personBean",Person.class );
        person.callYourPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        context.close();
    }
}

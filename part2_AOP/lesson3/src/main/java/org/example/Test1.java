package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        library.getBook();
        library.getMagazine();
        SchoolLibrary schoolLibrary=context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();


        context.close();
    }
}

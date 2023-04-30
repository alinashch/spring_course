package org.example;

import org.springframework.stereotype.Component;

@Component

public class UniLibrary extends AbstractLibrary{
    @Override
    public void getBook(){
        System.out.println("Get book from university");
    }
    public void getMagazine(){
        System.out.println("Get Magazine from university");
    }

}

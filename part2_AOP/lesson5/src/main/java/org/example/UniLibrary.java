package org.example;

import org.springframework.stereotype.Component;

@Component

public class UniLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("UniLibrary: Мы берем книгу");
    }

    public void getMagazine() {
        System.out.println("UniLibrary: Мы берем журнал");
    }

    public void returnBook() {
        System.out.println("UniLibrary: Мы возвращаем книгу");
    }

    public void returnMagazine() {
        System.out.println("UniLibrary: Мы возвращаем журнал");
    }

    public void addBook(){
        System.out.println("UniLibrary: Мы добавляем книгу");
    }


    public void addMagazine(){
        System.out.println("UniLibrary: Мы добавляем журнал");
    }

}

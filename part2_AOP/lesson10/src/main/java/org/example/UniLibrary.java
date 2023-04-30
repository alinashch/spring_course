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

    public String returnBook() {
        int a=10/0;
        System.out.println("UniLibrary: Мы возвращаем книгу");
        return "rrrr";
    }

    public void returnMagazine() {
        System.out.println("UniLibrary: Мы возвращаем журнал");
    }

    public void addBook(String person, Book book ){
        System.out.println("UniLibrary: Мы добавляем книгу");
    }


    public void addMagazine(){
        System.out.println("UniLibrary: Мы добавляем журнал");
    }

}

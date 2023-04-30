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

    public boolean returnBook() {
        System.out.println("UniLibrary: Мы возвращаем книгу");

        return true;
    }

}

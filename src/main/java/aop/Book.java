package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("A Fairy Song")
    private String name;

    @Value("Shakespeare")
    private String author;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Value("1596")
    private int yearOfPublication;

    public String getName() {
        return name;

    }
}

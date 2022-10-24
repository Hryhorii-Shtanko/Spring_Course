package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("We take the book from UniLibrary" );
        System.out.println("---------------------------------");
    }
    public String returnBook(){
       //That will show possibilities of exception handling
        int a = 10/0;
        System.out.println("We are return book to UniLibrary");
        return "War and peace";

    }

    public void getMagazine(){
        System.out.println("We take the magazine from UniLibrary");
        System.out.println("---------------------------------");
    }
    public void returnMagazine(){
        System.out.println("We return the magazine to UniLibrary");

System.out.println("---------------------------------");}
    public void addBook(String person_name, Book book){
        System.out.println("We add the book in UniLibrary" );
        System.out.println("---------------------------------");
    }
    public void addMagazine(){
        System.out.println("We add the magazine in UniLibrary" );
        System.out.println("---------------------------------");
    }
}
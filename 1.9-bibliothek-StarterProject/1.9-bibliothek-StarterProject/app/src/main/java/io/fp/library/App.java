package io.fp.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Student luca = new Student("luca", 764389, "WI");
        

        Book buch1 = new Book("Harry Potter und der Stein der Weisen", 1111, "J.K. Rowling", 1);
        Book buch2 = new Book("Harry Potter und der Stein der Weisen", 1111, "J.K. Rowling", 2);
        Book buch3 = new Book("Harry Potter und die Kammer des Schreckens", 1112, "J.K. Rowling", 1);
        Book buch4 = new Book("Harry Potter und die Kammer des Schreckens", 1112, "J.K. Rowling", 2);

        ArrayList<Book> harryPotter1 = new ArrayList<>();
        harryPotter1.add(buch1);
        harryPotter1.add(buch2);
        ArrayList<Book> harryPotter2 = new ArrayList<>();
        harryPotter2.add(buch3);
        harryPotter2.add(buch4);

        Map<Integer, List<Book>> catalouge = new HashMap<>();
        catalouge.put(buch1.getIsbn(), harryPotter1);
        catalouge.put(buch3.getIsbn(), harryPotter2);

        Library bib = new Library(catalouge);

        bib.borrowBook(buch1.getIsbn(), luca);
        bib.borrowBook(buch3.getIsbn(), luca);
        System.out.println("Books borrowed form Luca: " + bib.getBooksOfStudent(luca).toString());
        bib.returnBook(buch1.getIsbn(), buch1.getExemplarID());
        System.out.println("Books borrowed form Luca: " + bib.getBooksOfStudent(luca).toString());
    }
}

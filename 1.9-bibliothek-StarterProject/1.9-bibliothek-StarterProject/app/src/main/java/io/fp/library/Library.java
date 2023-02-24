package io.fp.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    Map<Integer, List<Book>> libraryCatalogue = new HashMap<>();

    public Library(Map<Integer, List<Book>> allBooks) {
        this.libraryCatalogue = allBooks;
    }

    public List<Book> getBooksOfStudent(Student student) {
       // Aufgabe d)
        List<Book> borrowedBooks=new ArrayList<>();
       for ( List<Book> map : libraryCatalogue.values()) {
        for (Book book : map) {
            if(book.getCurrentBorrower()==student)borrowedBooks.add(book);
        }
       }
       return borrowedBooks;
    }

    public Book getAvailableBook(int isbn) {
        // Aufgabe a)
        if(libraryCatalogue.containsKey(isbn))
        {
            List<Book> book=libraryCatalogue.get(isbn);
            for (Book b : book) {
                if(!b.isBorrowed()) return b;
            }
        }
        return null;
    }

    public boolean borrowBook(int isbn, Student student) {
        // Aufgabe b)
        Book book=getAvailableBook(isbn);
        if(getAvailableBook(isbn)!=null)
        {
            book.setBorrowed(true);
            book.setCurrentBorrower(student);
            return book.isBorrowed();
        }else return false;
    }

    public void returnBook(int isbn, int exemplarID) {
       // Aufgabe c)
       List<Book> books=libraryCatalogue.get(isbn);
       if(books!=null){
       for (Book book : books) {
            if(book.getExemplarID()==exemplarID) 
        {
            book.addPreviousBorrower(book.getCurrentBorrower());
            book.setBorrowed(false);
            book.setCurrentBorrower(null);
        }
    }
       }
    }

}

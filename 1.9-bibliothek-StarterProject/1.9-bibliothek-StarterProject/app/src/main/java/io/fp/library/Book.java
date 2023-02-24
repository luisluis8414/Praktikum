package io.fp.library;

import java.util.ArrayList;

public class Book {
    private String name;
    private int isbn;
    private String author;
    private int exemplarID;
    private boolean isBorrowed;
    private Student currentBorrower;
    private ArrayList<Student> previousBorrower;

    public Book(String name, int isbn, String author, int exemplarID) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.exemplarID = exemplarID;
        this.isBorrowed = false;
        this.previousBorrower = new ArrayList<>();
    }

    public Student getCurrentBorrower() {
        return currentBorrower;
    }

    public void setCurrentBorrower(Student currentBorrower) {
        this.currentBorrower = currentBorrower;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<Student> getPreviousBorrower() {
        return previousBorrower;
    }

    public void addPreviousBorrower(Student student) {
        previousBorrower.add(student);
    }

    public int getExemplarID() {
        return exemplarID;
    }

    public void setExemplar(int exemplarID) {
        this.exemplarID = exemplarID;
    }

    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return book.getExemplarID() == exemplarID;
    }

}

package io.fp.notebook;

import java.util.ArrayList;

public class Notebook<T> {
    private ArrayList<Note<T>> list=new ArrayList<>();  

    public Notebook()
    {
        //ArrayList<Note<T>> list= new ArrayList<>();
    }

    public void addNote(Note<T> n)
    {
        list.add(n);
    }

    public void printToDoList()
    {
        for (Note<T> l : list) {
            System.out.println(l.toString());
        }
    }
}

package io.fp.dictionary;

import java.io.IOException;

public class App {
   

    public static void main(String[] args) {

        String fileName = null;
        if (args.length==0)  {
            fileName="dictionary.txt";
        } else {
            fileName=args[0];
        }
        try{
        Dictionary dictionary = new Dictionary();
        //call method loadDictionary
        dictionary.loadDictionary(fileName);

        dictionary.addWordsToDictionary("Zebra", "Zebra");
        dictionary.addWordsToDictionary("Milk", "Milch");
        dictionary.addWordsToDictionary("House", "Haus");

        System.out.println(dictionary.getEnglischWord("Apfel"));
        dictionary.removeWordFromDictionary("Hello");
        //call method saveDictionary 
        dictionary.saveDictionary(fileName);      
        }catch(IOException e) 
        {
            e.getStackTrace();
        }
    }
}

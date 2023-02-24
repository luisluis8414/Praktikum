package io.fp.dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Dictionary {

    private Map<String, String> dictionary = new TreeMap<>();

    public void addWordsToDictionary(String english, String german) {
        dictionary.put(english, german);
    }

    public void removeWordFromDictionary(String english){
        dictionary.remove(english);
    }

    public String getGermanWord(String english){
        return dictionary.get(english);
    }

    public String getEnglischWord(String germanWord){
        String englishWord = "";
        if(dictionary.containsValue(germanWord)){
           for(Entry<String, String> entry  :dictionary.entrySet()){
            if(entry.getValue().equals(germanWord)){
                englishWord = entry.getKey();
            }
           }
        }
        return englishWord;
    }

    //a)
    public void loadDictionary(String fileName) throws IOException {
        //FileReader in = new FileReader(fileName);
        //StringBuilder sb= new StringBuilder();
        //String english="";
        //String german="";
        //boolean isGerman=false;
        //int i;
        //while((i=in.read())!=-1)
        //{
        //    char c=(char)i;
        //    if(isGerman){
        //        if((c=(char)i)!= ':')sb.append(c);
        //        else {
        //            german=sb.toString();
        //            sb=new StringBuilder();;
        //        }
        //    }else{
        //    if((c=(char)i)!= ':')sb.append(c);
        //    else {
        //        english=sb.toString();
        //        sb=new StringBuilder();;
        //    }
        //    }
        //    if((c=(char)i)==' ')
        //    {
        //        addWordsToDictionary(english, german);
        //    }
        //}


        //File file = new File(fileName);
        //if(file.exists()){
        //try(BufferedReader reader=new BufferedReader(new FileReader(fileName))){
        //String line;
        //while((line=reader.readLine())!=null)
        //{
        //    String[]words=line.split(":");
        //    addWordsToDictionary(words[0], words[1]);
        //}
        //}catch(IOException e){
        //    e.getStackTrace();
        //}}else System.out.println("File not found");
        
        File file = new File(fileName);
        if(file.exists()){
            try(Scanner sc= new Scanner(file))
            {
            while(sc.hasNext())
            {
                String line=sc.nextLine();
                String[]words=line.split(":");
                addWordsToDictionary(words[0], words[1]);
            }
            }
         }else System.out.println("File not found");
        
    }

    //b)
    public void saveDictionary(String fileName) throws IOException {
        File file = new File(fileName);
        if(file.exists()){
        }else file.createNewFile();
        try(FileWriter writer = new FileWriter(file)){
  
        for(Map.Entry<String, String> entry: dictionary.entrySet())
        {
            String s=entry.getKey() + ":" +entry.getValue() + System.lineSeparator();
            writer.write(s);
        }
    }
    }
}

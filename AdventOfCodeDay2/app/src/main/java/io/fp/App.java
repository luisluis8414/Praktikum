/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.fp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {


    public static void main(String[] args){
    int score=0;
        try{
    Scanner scanner = new Scanner(new File("input.txt"));
    
    int index=0;
    while (scanner.hasNextLine()) {
        scanner.nextLine();
        index++;
      }
      

    String[] array=new String[index]; 
    Scanner scanner2 = new Scanner(new File("input2.txt"));
    int x=0;
    while (scanner2.hasNextLine()) {
        
      String line = scanner2.nextLine();
      array[x]=line;
      System.out.println(array[x]);
      x++;
    }
   
    for(int i=0;i<index;i++)
        {
            if(array[i]=="A"&&array[i+1]=="X")score=score+3+1;
            if(array[i]=="A"&&array[i+1]=="Y")score=score+6+2;
            if(array[i]=="A"&&array[i+1]=="Z")score=score+0+3;
            if(array[i]=="B"&&array[i+1]=="X")score=score+0+1;
            if(array[i]=="B"&&array[i+1]=="Y")score=score+3+2;
            if(array[i]=="B"&&array[i+1]=="Z")score=score+6+3;
            if(array[i]=="C"&&array[i+1]=="X")score=score+6+1;
            if(array[i]=="C"&&array[i+1]=="Y")score=score+0+2;
            if(array[i]=="C"&&array[i+1]=="Z")score=score+3+3;
            i++;
        }
    System.out.println(score);
    }catch(FileNotFoundException e)
    {
        e.getMessage();
    }

    
}
}

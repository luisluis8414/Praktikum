package io.fp.campuszuhause;

import java.util.ArrayList;

public class Fakultaet {
    private String name;
    private ArrayList<Professor> professoren;
    private ArrayList<Assistent> assistenten;

    public Fakultaet(String name)
    {
        this.name=name;
        this.professoren=new ArrayList<Professor>();
        this.assistenten=new ArrayList<Assistent>();
    }
    public String getName() {
        return name;
    }
    
    public void addProf(Professor prof)
    {
        if(professoren.contains(prof))
        {
            throw new RuntimeException();
        }
        else{
            professoren.add(prof);
        }
    }
    public void addAssist(Assistent assist)
    {
        if(assistenten.contains(assist))
        {
            throw new RuntimeException();       
        }else{
            assistenten.add(assist);
        }

        
    }
    //Welche Assistenten sind einem bestimmten Professor zugeordnet?
    public void gibAssistentZuProf(Professor prof) 
    {
        for(Assistent assi: assistenten) {
            if(assi.getBoss().equals(prof)){
                System.out.println(assi.getBoss() + " ist der Boss von " + assi.getName());
            }
        }
    }
}

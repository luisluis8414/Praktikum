package io.fp.container;

import java.util.ArrayList;


public class Ship 
{
    private double maxWeight= 30000;
    private double currentWeight=0;
    private ArrayList<Container<? extends Cargo>> registeredContainters=new ArrayList<>();

    public Ship() {}
    
    public ArrayList<Container<? extends Cargo>> getRegisteredContainters() {
        return registeredContainters;
    }


    public ArrayList<Container<? extends Cargo>> registerContainer(ArrayList<Container<? extends Cargo>> prevContainers)
    {
        for(Container<? extends Cargo> cont: prevContainers)
        {
            if(currentWeight+cont.getCurrentWeight()<=maxWeight)
            {
                registeredContainters.add(cont);
                currentWeight+=cont.getCurrentWeight();
            }
        }
        return registeredContainters;
    }
    
}

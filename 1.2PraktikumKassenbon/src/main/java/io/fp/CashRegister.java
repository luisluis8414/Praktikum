package io.fp;

import java.util.ArrayList;

public class CashRegister {
    private ArrayList<Product> produkte;

    public CashRegister(ArrayList<Product> produkte)
    {
        this.produkte=produkte;
    }

    public CashRegister()
    {
        produkte = new ArrayList<>();
    }
    
    
     public void scanProduct(Product produkt) 
     {
        produkte.add(produkt);
     }

     public void printRecipt() 
     {
        System.out.println("---Recipt---");
        for(Produktarten prod: Produktarten.values())
        {   
            System.out.println("---" + prod + "---");
            for(Product product: produkte ) {
                 if(product.getProduktgruppe().equals(prod))
               {
                  System.out.println(product.toString());
               }


            }
        }
       
     }
        
    
}

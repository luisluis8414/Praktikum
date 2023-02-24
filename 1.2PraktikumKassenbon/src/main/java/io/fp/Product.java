package io.fp;

public class Product {
    private String name;
    private double preis;
    private Produktarten produktgruppe;


    public Product(String name, double preis, Produktarten produktgruppe)
    {
        this.name=name;
        this.preis=preis;
        this.produktgruppe=produktgruppe;
    }


    @Override
    public String toString() {
        return name + ":    " + String.format("%.2f", preis) + "$";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPreis() {
        return preis;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }

    public Produktarten getProduktgruppe() {
        return produktgruppe;
    }

    public void setProduktgruppe(Produktarten produktgruppe) {
        this.produktgruppe = produktgruppe;
    }
    
    

    
}


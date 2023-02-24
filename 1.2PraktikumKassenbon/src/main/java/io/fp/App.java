/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.fp;

public class App {
    

    public static void main(String[] args) {
        Product milk = new Product("Milch", 1.22, Produktarten.DAIRY);
        Product cheese = new Product("Cheese", 3.20, Produktarten.DAIRY);
        Product beer = new Product("Beer", 0.47, Produktarten.BEVERAGES);
        Product carrots = new Product("Carrots",2.1, Produktarten.VEGETABLES);
        Product steak = new Product("Steak", 7.1, Produktarten.MEAT);
        CashRegister c = new CashRegister();
        c.scanProduct(milk);
        c.scanProduct(cheese);
        c.scanProduct(beer);
        c.scanProduct(carrots);
        c.scanProduct(steak);

        c.printRecipt();
        
    }
}
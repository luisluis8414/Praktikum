package io.fp.drucker;


import java.util.PriorityQueue;


public class Printer {
    private PriorityQueue<PrintJob> printerQue;

    public Printer() {
        this.printerQue= new PriorityQueue<>();
    }
    
    public void addPrintJob(PrintJob prJob)
    {
        printerQue.add(prJob);
    }

    public PrintJob getNextPrintJob()
    {
        return printerQue.peek();
    }

    public void printAll()
    {
        System.out.println(printerQue);
        while(!printerQue.isEmpty()) 
        {
            printerQue.poll();
            System.out.println(printerQue);
        }
    }
    
}

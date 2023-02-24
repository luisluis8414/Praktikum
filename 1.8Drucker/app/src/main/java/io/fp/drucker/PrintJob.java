package io.fp.drucker;

public class PrintJob implements Comparable<PrintJob>{
    private String printedString;
    private Person person;

    public PrintJob(String printedString, Person person) {
        this.printedString = printedString;
        this.person = person;
    }
    public String getPrintedString() {
        return printedString;
    }
    public void setPrintedString(String printedString) {
        this.printedString = printedString;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString()
    {
        return person.toString() + ", has printed: " + printedString;
    }
    @Override
    public int compareTo(PrintJob prJ) {
    
        return this.person.getMemberType().compareTo(prJ.person.getMemberType());
        

    }
}

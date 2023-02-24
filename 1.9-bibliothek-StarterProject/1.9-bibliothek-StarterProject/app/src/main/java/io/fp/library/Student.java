package io.fp.library;

public class Student {
    private String name;
    private int matrikelNR;
    private String subject;

    public Student(String name, int matrikelNR, String subject) {
        this.name = name;
        this.matrikelNR = matrikelNR;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatrikelNR() {
        return matrikelNR;
    }

    public void setMatrikelNR(int matrikelNR) {
        this.matrikelNR = matrikelNR;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return  name;
    }

    
}

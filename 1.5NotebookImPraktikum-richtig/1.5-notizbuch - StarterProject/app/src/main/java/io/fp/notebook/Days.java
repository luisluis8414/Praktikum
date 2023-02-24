package io.fp.notebook;

public enum Days {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    THURSDAY("Thursday"),
    WEDNESDAY("Wensday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String dayString;

    private Days(String dayString) {
        this.dayString = dayString;
    }

    public String toString(){
        return dayString;
    }
}

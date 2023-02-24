package io.fp.bmiCalculator;

public class Calculation {
    private double bmi;
    private Category category;

    public Calculation(double bmi, Category category) {
        this.bmi =Math.round(bmi * 100)/100 ;
        this.category = category;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Calculations [bmi=" + bmi + ", category=" + category + "]";
    }

}

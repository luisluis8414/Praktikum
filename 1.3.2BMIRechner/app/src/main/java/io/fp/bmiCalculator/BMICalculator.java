package io.fp.bmiCalculator;

public class BMICalculator {
    static double computeBMI(double weight, double height) throws BMICalculatorException
    {
        
        if(height>1||height<3.00&&weight>30||weight<400)return (weight/(height*height));
        
        else throw new BMICalculatorException("BMI nicht berechenbar. Flasche Werte uebergeben");

    }
}

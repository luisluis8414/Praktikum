package io.fp.bmiCalculatorFX.model;

public class BMICalculator {

  public static double computeBMI(double weight, double height) throws BMICalculatorException {
    if (weight < 20 || weight > 200 || height < 0.5 || height > 2.50)
      throw new BMICalculatorException("The values are out of range for a human");
    return weight / (height * height);
  }

}

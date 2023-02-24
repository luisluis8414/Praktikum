package io.fp.bmiCalculatorFX.model;

import java.io.Serializable;
import java.util.ArrayList;

public class HealthCheck implements Serializable {

  private ArrayList<Calculation> history = new ArrayList<>();

  public String executeHealthCheck(double weight, double height) throws CategoryException, BMICalculatorException {
    double bmi = BMICalculator.computeBMI(weight, height);
    Calculation calculation = new Calculation(bmi, Category.getCategory(bmi));
    history.add(calculation);
    return calculation.toString();
  }
  
  public ArrayList<Calculation> getHistory() {
    return history;
  }

  public void addCalculation(double bmi, Category category) {
    history.add(new Calculation(bmi, category));
  }

  public String getCategoryStatistics() {
    StringBuilder sb = new StringBuilder();
    sb.append("Statistic: \n");
    for (Category category : Category.values()) {
      int count = 0;
      for (Calculation calculations : history) {
        if (calculations.getCategory().equals(category)) {
          count++;
        }
      }
      sb.append("[" + category + ": " + count + "]\n");
    }

    return sb.toString();
  }

  public String getAverageBMI() {
    double avg = 0;
    for (Calculation calculations : history) {
      avg += calculations.getBmi();
    }
    return "Average BMI: " + avg / history.size();
  }
}

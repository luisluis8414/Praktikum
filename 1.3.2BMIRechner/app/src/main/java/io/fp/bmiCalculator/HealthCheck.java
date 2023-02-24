package io.fp.bmiCalculator;


import java.util.ArrayList;

public class HealthCheck {

  private ArrayList<Calculation> history = new ArrayList<>();


  public void executeHealthCheck(double weight, double height)throws Exception{
    //Aufgabe c) 
    double bmi=BMICalculator.computeBMI(weight, height);
    Calculation calc=new Calculation(bmi, Category.getCategory(bmi));
    history.add(calc);
  }
  
  public void printAverageBMI() {
    //Aufgabe d)
    double AvgBMI=0;
    for(Calculation c:history)
    {
      AvgBMI=AvgBMI+ c.getBmi();
    }
    AvgBMI=AvgBMI/history.size();
    System.out.println("Der durschnittliche BMI betraegt: " + AvgBMI);
  }
  
  public void printHistory() {
    System.out.println("Ihre Historie: ");
    for (Calculation calculations : history) {
      System.out.println(calculations.toString() + "\n");
    }
  }

  public void printCategoryStatistics() {
    for(Category category : Category.values()){
      int count = 0;
      for (Calculation calculations : history) {
        if (calculations.getCategory().equals(category)) {
          count++;
        }
      }
      System.out.println("["+category + ": " + count+"]");
    }
  }

  
}

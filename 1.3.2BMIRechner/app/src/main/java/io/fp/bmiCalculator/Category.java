package io.fp.bmiCalculator;

public enum Category {

    UNDERWEIGHT(14, 18.5),
    HEALTHY(18.5, 25),
    OVERWEIGHT(25.0, 30),
    OBESE(30, 80);

    private final double upperBoundary;
    private final double lowerBoundary;

    private Category(double lowerBoundary, double upperBoundary) {
        this.lowerBoundary = lowerBoundary;
        this.upperBoundary = upperBoundary;
    }

    public static Category getCategory(double bmi) throws CategoryException{
        if(bmi>14&&bmi<80){
            if (bmi > Category.UNDERWEIGHT.lowerBoundary && bmi <= Category.UNDERWEIGHT.upperBoundary) {
                return Category.UNDERWEIGHT;
            } else if (bmi > Category.HEALTHY.lowerBoundary && bmi <= Category.HEALTHY.upperBoundary) {
                return Category.HEALTHY;
            } else if (bmi > Category.OVERWEIGHT.lowerBoundary && bmi <= Category.OVERWEIGHT.upperBoundary) {
                return Category.OVERWEIGHT;
            } else {
                return Category.OBESE;
            }
    }else throw new CategoryException("BMI ausserhalb des Mittelmass");
    }
}

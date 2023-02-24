package io.fp.bmiCalculatorFX.model;

public enum Category{

    UNDERWEIGHT(14, 18.5),
    HEALTHY(18.5, 25),
    OVERWEIGHT(25, 30),
    OBESE(30, 40);

    private final double upperBoundary;
    private final double lowerBoundary;

    private Category(double lowerBoundary, double upperBoundary) {
        this.lowerBoundary = lowerBoundary;
        this.upperBoundary = upperBoundary;
    }

    public static Category getCategory(double bmi) {
        if (bmi > Category.UNDERWEIGHT.lowerBoundary && bmi <= Category.UNDERWEIGHT.upperBoundary) {
            return Category.UNDERWEIGHT;
        } else if (bmi > Category.HEALTHY.lowerBoundary && bmi <= Category.HEALTHY.upperBoundary) {
            return Category.HEALTHY;
        } else if (bmi > Category.OVERWEIGHT.lowerBoundary && bmi <= Category.OVERWEIGHT.upperBoundary) {
            return Category.OVERWEIGHT;
        } else if (bmi > Category.OBESE.lowerBoundary && bmi <= Category.OBESE.upperBoundary) {
            return Category.OBESE;
        } else {
            throw new CategoryException("This BMI can not be converted into a category");
        }

    }
}

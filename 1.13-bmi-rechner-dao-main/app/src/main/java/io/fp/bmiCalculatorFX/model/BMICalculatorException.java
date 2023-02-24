package io.fp.bmiCalculatorFX.model;

public class BMICalculatorException extends Exception {

    public BMICalculatorException() {
    }

    public BMICalculatorException(String message) {
        super(message);
    }

    public BMICalculatorException(Throwable cause) {
        super(cause);
    }

    public BMICalculatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public BMICalculatorException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

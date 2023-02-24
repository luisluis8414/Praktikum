package io.fp.bmiCalculatorFX.dao;

import java.io.IOException;

import io.fp.bmiCalculatorFX.model.HealthCheck;

public interface BMICalculatorDAO {
    
    HealthCheck createStore() throws IOException;
	
    HealthCheck readStore() throws IOException;
	
	void updateStore(HealthCheck store) throws IOException;
	
	void deleteStore() throws IOException;
}

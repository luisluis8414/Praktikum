package io.fp.bmiCalculatorFX.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import io.fp.bmiCalculatorFX.model.Calculation;
import io.fp.bmiCalculatorFX.model.Category;
import io.fp.bmiCalculatorFX.model.HealthCheck;

public class TextDaoImpl implements BMICalculatorDAO {

    private File storeFile;

    public TextDaoImpl(String fileName) {
        this.storeFile = new File(fileName);
    }

    @Override
    public HealthCheck createStore() throws IOException {

        if (!storeFile.exists()) {
            try (FileWriter wr = new FileWriter(storeFile)) {
                storeFile.createNewFile();
                HealthCheck healthCheck = new HealthCheck();
                return healthCheck;
            }
        } else {
            throw new IOException("Store already exists!");
        }

    }

    @Override
    public HealthCheck readStore() throws IOException {
        if (storeFile.exists()) {
            try (Scanner sc = new Scanner(storeFile)) {
                HealthCheck healthCheck = new HealthCheck();
                while (sc.hasNext()) {
                    String line = sc.nextLine();
                    String[] arr = line.split(":");
                    Double bmi = Double.parseDouble(arr[0]);
                    healthCheck.addCalculation(bmi, Category.getCategory(bmi));
                }
                return healthCheck;
            }
        } else {
            throw new IOException("Store doesnt exists!");
        }

    }

    @Override
    public void updateStore(HealthCheck store) throws IOException {
        if (storeFile.exists()) {
            try (FileWriter wr = new FileWriter(storeFile)) {
                for (Calculation calc : store.getHistory()) {
                    wr.write(calc.getBmi() + " : " + calc.getCategory() + System.lineSeparator());
                }
            }
        } else {
            throw new IOException("Store doesnt exists!");
        }

    }

    @Override
    public void deleteStore() throws IOException {
        if (storeFile.exists())
            storeFile.delete();
        else
            throw new IOException("Store doesnt exists!");
    }

}

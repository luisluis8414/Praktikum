package io.fp.bmiCalculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        HealthCheck healthCheck = new HealthCheck();
        try (Scanner scanner = new Scanner(System.in)) {
            
            boolean continueHealtCheck = true;
            while (continueHealtCheck) {
                System.out.println("------ Start des Health Checks ------\n");
                System.out.println("Geben Sie ihre Größe in Meter ein:");
                String heightString = scanner.nextLine();
                System.out.println("Geben Sie ihr Gewicht in Kilogramm ein:");
                String weightString = scanner.nextLine();

                    healthCheck.executeHealthCheck(Double.parseDouble(weightString), Double.parseDouble(heightString));
                    System.out.println("Möchten Sie Ihre Historie sehen? (Y/N)");
                    String answer = scanner.nextLine();
                    if (answer.equals("Y")) {
                        healthCheck.printHistory();
                    }
                    System.out.println("Möchten Sie noch einen Health Check durchführen? (Y/N)");
                    answer = scanner.nextLine();
                    if (!answer.equals("Y")) {
                        healthCheck.printAverageBMI();
                        System.out.println("Statistik der Kategorien: ");
                        healthCheck.printCategoryStatistics();
                        continueHealtCheck = false;
                    }
               

                    
                
                
                }
            }
        }

    }


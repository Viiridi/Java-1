package main;

import pojos.EmploymentContract;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        EmploymentContract contract = new EmploymentContract();
        System.out.printf("Gross hourly rate: ");
        contract.grossHourlyRate = keyboard.nextDouble();
        System.out.printf("Hours per week: ");
        contract.hoursPerWeek = keyboard.nextDouble();
        System.out.printf("Annual net salary: %.2f\n", contract.annualNetSalary());
    }
}

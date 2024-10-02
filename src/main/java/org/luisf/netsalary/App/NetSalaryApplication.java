package org.luisf.netsalary.App;

import org.luisf.netsalary.entities.Employee;
import org.luisf.netsalary.services.PensionService;
import org.luisf.netsalary.services.SalaryService;
import org.luisf.netsalary.services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class NetSalaryApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your gross salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, salary);
        TaxService taxService = new TaxService();
        PensionService pensionService = new PensionService();
        SalaryService salaryService = new SalaryService(taxService, pensionService);

        double netSalary = salaryService.netSalary(employee);
        System.out.println("Your net salary is: " + netSalary);
//        System.out.println("The tax on salary is: " + taxService.calculateTax(salary));
//        System.out.println("The discount on salary is: " + pensionService.calculatePension(salary));

        scanner.close();
    }
}

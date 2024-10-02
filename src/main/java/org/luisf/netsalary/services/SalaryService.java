package org.luisf.netsalary.services;

import org.luisf.netsalary.entities.Employee;

public class SalaryService {
    // wrong implementation mode
    private TaxService taxService;
    private PensionService pensionService;

    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(Employee employee) {
        return employee.getGrossSalary() - taxService.calculateTax(employee.getGrossSalary())
                - pensionService.calculatePension(employee.getGrossSalary());
    }
}

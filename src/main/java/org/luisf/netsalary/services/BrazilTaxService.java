package org.luisf.netsalary.services;

public class BrazilTaxService  extends TaxService {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.3;
    }
}

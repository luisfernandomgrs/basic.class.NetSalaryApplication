package org.luisf.netsalary.entities;

public class Employee {
    private String firstName;
    private double grossSalary;

    public Employee() {
    }

    public Employee(String firstName, double grossSalary) {
        this.firstName = firstName;
        this.grossSalary = grossSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
}

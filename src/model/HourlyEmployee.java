/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author zer0, the Maverick Hunter
 */
public class HourlyEmployee extends Employee {
    private double rate;
    private double workingHours;

    public HourlyEmployee(String employeeName, Integer employeeAge, Double employeeSalary, double rate, double workingHours) {
        super(employeeName, employeeAge, employeeSalary);
        setWorkingHours(workingHours);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = (rate < 0.0) ? 0.0 : rate;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = (workingHours < 0.0) ? 0.0
                : workingHours;
    }
}
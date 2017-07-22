/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import model.Employee;
import java.util.ArrayList;
import model.Division;

/**
 * @author zer0, the Maverick Hunter
 */
public class Create {
    
    public Employee createDivisionHead() {
        Employee p = new Employee();
        p.setEmployeeSalary((double) 7000000);
        p.setEmployeeName("Division Head");
        p.setEmployeeAge(45);
        
        return p;
    }
    
    public Division createDivision(Employee employee) {
        Division d = new Division();

        d.setDivisionName("Technology Division");
        d.setDivisionHead(employee);

        return d;
    }
    
    public ArrayList<Employee> createEmployess(Integer jumlah) {
        ArrayList<Employee> employess = new ArrayList<>();
        for (int i = 0; i<jumlah; i++) {
            Employee p = new Employee();
            p.setEmployeeName("Employee_"+i);
            p.setEmployeeAge(20+i);
            p.setEmployeeSalary((double) 2000000*i);
            employess.add(p);
        }
        
        return employess;
    }
}
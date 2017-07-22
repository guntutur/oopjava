/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.Division;
import java.util.ArrayList;
import model.Employee;
import data.Create;
import repository.WorkPlacement;

/**
 *
 * @author zer0, the Maverick Hunter
 */
public class Company implements WorkPlacement {
    
    private final ArrayList<Employee> employess;
    private final Employee divisionHead;
    private final Division division;
    
    protected Create bp = new Create();
    
    public Company(){
        this.employess = bp.createEmployess(3);
        this.divisionHead = bp.createDivisionHead();
        this.division = bp.createDivision(this.divisionHead);
    }
    
    public static void main(String[] args) {
        Company copmany = new Company();
        copmany.tampilkanPegawai();
        copmany.printEmployeePlacement();
    }
    
    public void tampilkanPegawai() {
        for(int i = 0; i < this.employess.size(); i++) {
            System.out.println("Nama Karyawan : " + this.employess.get(i).getEmployeeName());
        }
    }
    
    
    public void printEmployeePlacement() {
        this.setWorkPlacement(this.employess, this.division);
    }
    
    @Override
    public void setWorkPlacement(ArrayList<Employee> employees, Division division) {
        for(int i = 0; i < employees.size(); i++) {
            System.out.println(
                    employees.get(i).getEmployeeName()+" is placed on Division : "
                            + ""+division.getDivisionName()+" "
                            + "with Division Head "+division.getDivisionHead().getEmployeeName());
        }
    };
}
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
public class Division {
    
    private String divisionName;
    private Employee DivisionHead;

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public Employee getDivisionHead() {
        return DivisionHead;
    }

    public void setDivisionHead(Employee DivisionHead) {
        this.DivisionHead = DivisionHead;
    }   
}
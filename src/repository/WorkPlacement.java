/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import model.Division;
import model.Employee;

/**
 *
 * @author zer0, the Maverick Hunter
 */
public interface WorkPlacement {
    public void setWorkPlacement(ArrayList<Employee> employees, Division division);
}
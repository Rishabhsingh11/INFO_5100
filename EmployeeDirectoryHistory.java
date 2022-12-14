/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author risha
 */
public class EmployeeDirectoryHistory 
{
    private ArrayList<EmployeeDirectory>emphistory;
    
    public EmployeeDirectoryHistory()
    {
        this.emphistory = new ArrayList<EmployeeDirectory>();
    }

    public ArrayList<EmployeeDirectory> getEmphistory() {
        return emphistory;
    }

    public void setEmphistory(ArrayList<EmployeeDirectory> emphistory) {
        this.emphistory = emphistory;
    }
    
    public EmployeeDirectory addNewEmployee() 
    {
        EmployeeDirectory emp = new EmployeeDirectory();
        emphistory.add(emp);
        return emp;
    }

    public void deleteEmployee(EmployeeDirectory selectedEmployee) 
    {
        emphistory.remove(selectedEmployee);
    }

    public void updateEmployee(EmployeeDirectory selectedEmployee) 
    {
        emphistory.set(0, selectedEmployee);
    }
}

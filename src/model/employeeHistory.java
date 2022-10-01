/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author dumma
 */
public class employeeHistory {
    
    private ArrayList<Employee> history;

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public employeeHistory() {
        this.history = new ArrayList();
    }
    
    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }

    public employeeHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    public void addNewEmployee(Employee emp){
        this.history.add(emp);
        
    }

    public void deleteEmployee(Employee emp) {
        history.remove(emp);
        
    }
}

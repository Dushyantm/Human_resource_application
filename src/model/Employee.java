/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author dumma
 */
public class Employee {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Integer contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    
    private String name;
    private Integer employeeID;
    private Integer age;
    private Integer contactInfo;
    private String emailID;

    public Employee(String name, Integer employeeID, Integer age, Integer contactInfo, String emailID) {
        this.name = name;
        this.employeeID = employeeID;
        this.age = age;
        this.contactInfo = contactInfo;
        this.emailID = emailID;
    }

    public Employee() {
    }
    
    
}

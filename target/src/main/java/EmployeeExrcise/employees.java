/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeExrcise;

/**
 *
 * @author ndabenhle
 */
public class employees {
    public String FirstName;
    public String LastName;
    public int employeesId;
    public double salary;
    public String departments;
    public int age;

    public employees(String FirstName, String LastName, int employeesId, double salary, String departments, int age) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.employeesId = employeesId;
        this.salary = salary;
        this.departments = departments;
        this.age = age;
    }
    
    
    
     public void display(){
        System.out.println("FirstName: " + getFirstName());
        System.out.println("LastName:" + getLastName());
        System.out.println("employeesID:" + getEmployeesId());
        System.out.println("salary: " + getSalary());
        System.out.println("department: " + getDepartments());
        System.out.println("Age: " + getAge());
        
        
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getEmployeesId() {
        return employeesId;
    }

    public void setEmployeesId(int employeesId) {
        this.employeesId = employeesId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

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
public class Finace extends employees {
   private String role;
   private String responsibilty;
   
    public Finace( String FirstName,String LastName, int employeesId, double salary, String departments,int age,String role,String responsibilty){
       super(FirstName,LastName,employeesId,salary,departments,age);
       this.role = role;
       this.responsibilty = responsibilty;
    }
   
      @Override
   public void display(){
       super.display();
       System.out.println("Role: " + getRole());
       System.out.println("Responsibilty: " + getResponsibilty());
   }
   
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getResponsibilty() {
        return responsibilty;
    }

    public void setResponsibilty(String responsibilty) {
        this.responsibilty = responsibilty;
    }
   
    
}

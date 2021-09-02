/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exrcise7_1;



/**
 *
 * @author ndabenhle
 */
 public class Customer { 
    public String name; 
    public int custID ;
    public String address ;
    public int orderNum ;
    public int age ;

   

    Customer(String chuck_Barry, int i, String los_Angelis, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
 
    
     public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("Customer ID: " + custID);
        System.out.println("Address: " + address);
        System.out.println("Order Number: " + orderNum);
        System.out.println("Age: " + age);
        
        
     }   

   
} 
      


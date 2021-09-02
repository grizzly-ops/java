/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap06;

/**
 *
 * @author ndabenhle
 */
 public class Customer { 
    public String name = "Grizzly";
    public int custID = 1278;
    public String address = "12 Barttle Road";
    public int orderNum = 24;
    public int age = 18;
 
    
     public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("Customer ID: " + custID);
        System.out.println("Address: " + address);
        System.out.println("Order Number: " + orderNum);
        System.out.println("Age: " + age);
        
        
     }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
} 
      


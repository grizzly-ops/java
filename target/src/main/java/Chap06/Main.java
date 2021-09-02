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
public class Main {
    public static void main(String[] args) {
        Customer customer01 = new Customer();
        Customer customer02 = customer01;
        
       // customer01.name = "Grizzly";
       // customer01.age = 40;
      //  customer01.address = "293 Barttel Roid";
      //  customer01.custID = 250;
       // customer01.orderNum = 25;
        
        customer01.setName("Grizzly Bear");
        customer01.setAddress("12 Barttel Road");
        customer01.setAge(22);         
        customer01.setCustID(2456);
        customer01.setOrderNum(34);
                
        //System.out.println(getAddress);
       /// System.out.println(getAge);
       // System.out.println(getOrderNum);
                
        //customer01.displayCustomer();
    }
}

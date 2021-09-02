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
public class Main1 {

    public static void main(String[] args) {
        Customer customer01 = new Customer("chuck Barry", 23, "Los Angelis", 233, 34);
        Customer customer02 = new Customer("larry smith", 25, "South Africa", 233, 25);
        Customer customer03 = new Customer("kakarot goku", 12, "japan", 453, 29);
        Customer customer04 = new Customer("Naruto Uzumaki", 46, "Hidden Leaf", 457, 32);

        Customer[] customers = {customer01, customer02, customer03, customer04};

        for (Customer customer : customers) {
            System.out.println("Customer Name:" + customer.name);
        }

        // customer01.name = "Grizzly";
        // customer01.age = 40;
        //  customer01.address = "293 Barttel Roid";
        //  customer01.custID = 250;
        // customer01.orderNum = 25;
        //  customer01.setName("Grizzly Bear");
        // customer01.setAddress("12 Barttel Road");
        // customer01.setAge(22);         
        //  customer01.setCustID(2456);
        //  customer01.setOrderNum(34);
        //System.out.println(getAddress);
        /// System.out.println(getAge);
        // System.out.println(getOrderNum);
       // customer01.displayCustomer();
    }
}

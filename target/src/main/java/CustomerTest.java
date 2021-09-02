/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ndabenhle
 */
public class CustomerTest {
   public static void getDiscount(Customer customer){
         int total = 500;
         Customer customer01 = new Customer("NONPROFIT",600);
         Customer customer02 = new Customer("PRIVATE",1200);
         Customer customer03 = new Customer("CORPORATION",700);
         
         getDiscount(customer01);
         getDiscount(customer02);
         getDiscount(customer03);       
         
           

       switch (customer.getCustomerType()) {
           case "NONPROFIT":
               if((customer.getTotal()) > 900){
                   System.out.println("Your discount will be a 10%.");
               }else{
                   System.out.println("Your discount will be a 8%.");
               }  break;
           case "PRIVATE":
               if((customer.getTotal()) > 900){
                   System.out.println("Your discount will be a 7%.");
               }else{
                   System.out.println("You have no discount.");
               }  break;
           case "CORPORATION":
               if((customer.getTotal()) > 500){
                   System.out.println("Your discount will be a 8%.");
               }else{
                   System.out.println("Your discount will be a 5%.");
               }  break;
           default:
               break;
       }
   }
}
    
    



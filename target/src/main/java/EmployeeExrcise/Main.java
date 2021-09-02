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
public class Main {
    public static void main(String[] args){
        HR emp01 = new HR("bill" ,"smith",1235,350000.0,"Human Resources",45,"HR Manger","Oversee HR staff");
        emp01.display();
        System.out.println(".........\n");
        
        IT emp02 = new IT("don","moore",2435,450000.0,"IT",35,"IT Specialist","Fix Software");
        emp02.display();
        System.out.println(".........\n");
        
        
        Finace emp03 = new Finace("fin","human",3425,750000.0,"Finace",18,"Charted accountant","takes care of money");
        emp03.display();
        System.out.println(".........\n");
        
    }
}

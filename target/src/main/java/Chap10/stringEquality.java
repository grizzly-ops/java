package Chap10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ndabenhle
 */
public class stringEquality {
  
    public String name1 = "Fred Smith";
    public String name2 = "Sam Smith";
    
    public void areNamesEqual() {
        if (name1 == (name2)){
            System.out.println("Same name");
            
        }
        else{
            System.out.println("Different name.");
        }
    }
}

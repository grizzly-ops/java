/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ndabenhle
 */
public class Main {
    public static void main(String[] args) {
        Cars BMW = new Cars("BMW","blue","M4","ND234_435",850000.0);
        System.out.println(".......\n"+BMW);
        
         Cars Mercedes = new Cars("Mercedes","black","c63s","ND435-546",750000.0);
        System.out.println(".......\n"+Mercedes);
        
         Cars Honda = new Cars("Honda","green","Civic","ND264_435",450000.0);
        System.out.println(".......\n"+Honda );
    }
}

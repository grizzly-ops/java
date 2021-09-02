/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

/**
 *
 * @author ndabenhle
 */
public class Trouser {
    private char WaistSize;
    private int length;
    private char gender;
    
    public Trouser(int itemID, String description, char colorCode, double price, char WaistSize, int lenght,char gender){
        super(itemID, description, colorCode, price);
        this.WaistSize = WaistSize;
        this.length = length;
        this.gender = gender;
        
        public void display(){
            super.display();
            System.out.println("waistSize: " + getWaistSize());
            System.out.println("length: " + getLength());
            System.out.println("gender: " + getGender());
        }
        public char getWaistSize() {
        return WaistSize;
    }

    public void setWaistSize(char WaistSize) {
        this.WaistSize = WaistSize;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
        
    }   


}


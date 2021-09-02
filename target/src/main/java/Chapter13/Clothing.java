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
public class Clothing {
   private int itemID = 0  ;
   private String desc = "-desciption is required";
   private char colorCode = 'U';
   private double price = 0.0;

   public void display(){
       System.out.println("itemID: " + getItemID());
       System.out.println("description: " + getDesc());
       System.out.println("colorCode: " + getColorCode());
       System.out.println("price: "+ getPrice());
   }
    
    
    public Clothing( String description, char colorCode, double price) {
        this.itemID = itemID;
        this.desc = desc;
        this.colorCode = color;
        this.price = price;        
    }
    
    
    public Clothing( char colorCode, double price) {
        this.colorCode = colorCode;
        this.price = price;
    }
    
    
    public Clothing( double price) {
        this.price = price;
    }

   public void display(){
       System.out.println("ShirtID:" + getShirtID());
       System.out.println("Description:" + getDescription());
       System.out.println("ColorCode:;" + getColorCode());
       System.out.println("Price:" + getPrice() + "\n");
   
   }

    public int getShirtID() {
        return shirtID;
    }

    public void setShirtID(int shirtID) {
        this.shirtID = shirtID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   
   @Override
   public String toString(){
       return "\nThis shirt is a " + desc +";"
               + "\nPrice: " + getPrice() + "\nColor: " + getColorCode();
    }
}


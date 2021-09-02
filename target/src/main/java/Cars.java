/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ndabenhle
 */
public class Cars {
    public String CarName;
    public String Carcolor;
    public String Model;
    public String NumberPlate;
    public double Price;

    public Cars(String CarName, String Carcolor, String Model, String NumberPlate, double Price) {
        this.CarName = CarName;
        this.Carcolor = Carcolor;
        this.Model = Model;
        this.NumberPlate = NumberPlate;
        this.Price = Price;
    }
    
     public void display(){
        System.out.println("CarName: " + getCarName());
        System.out.println("Color:" + getCarcolor());
        System.out.println("Model:" + getModel());
        System.out.println("department: " + getNumberPlate());
        System.out.println("Price: " + getPrice());

 
    
    
}

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String CarName) {
        this.CarName = CarName;
    }

    public String getCarcolor() {
        return Carcolor;
    }

    public void setCarcolor(String Carcolor) {
        this.Carcolor = Carcolor;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getNumberPlate() {
        return NumberPlate;
    }

    public void setNumberPlate(String NumberPlate) {
        this.NumberPlate = NumberPlate;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
}
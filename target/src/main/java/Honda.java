/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ndabenhle
 */
public class Honda extends Cars{
   public Honda(String CarName,String Carcolor,String Model,String NumberPlate,double Price){
      super(CarName,Carcolor,Model,NumberPlate,Price);
      
      
    }

    public String getCarName() {
        return CarName;
    }

   @Override
    public void setCarName(String CarName) {
        this.CarName = CarName;
    }

   @Override
    public String getCarcolor() {
        return Carcolor;
    }

   @Override
    public void setCarcolor(String Carcolor) {
        this.Carcolor = Carcolor;
    }

   @Override
    public String getModel() {
        return Model;
    }

   @Override
    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getNumberPlate() {
        return NumberPlate;
    }

    public void setNumberPlate(String NumberPlate) {
        this.NumberPlate = NumberPlate;
    }

   @Override
    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
}

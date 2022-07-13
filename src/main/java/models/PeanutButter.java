package models;

public class PeanutButter {
    private String brand;
    private String type;
    private int quantity;
    private double price;
    //SETTERS
    public void setType(String type){
        this.type = type;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }


    //GETTERS
    public String getType(){
        return this.type;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getPrice(){
        return this.price;
    }
    public String getBrand(){
        return this.brand;
    }


}

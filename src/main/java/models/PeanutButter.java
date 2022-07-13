package models;

public class PeanutButter {
    private String brand;
    private String type;
    private int quantity;
    private double price;

    //CONSTRUCTORS
    public PeanutButter(){
        brand = "";
        type = "";
        quantity = 0;
        price = 0.00;
    }

    public PeanutButter(String brand, String type, int quantity, double price){
        this.brand = brand;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }



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

package models;

public class Cracker {
    private String brand;
    private String type;
    private int quantity;
    private double price;
    private int id;

    //CONSTRUCTORS
    //CONSTRUCTORS
    public Cracker(){
        brand = "";
        type = "";
        quantity = 0;
        price = 0.00;
        id = 0;
    }

    public Cracker(String brand, String type, int quantity, double price, int id){
        this.brand = brand;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.id = id;
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
    public int getId(){
        return this.id;
    }


}

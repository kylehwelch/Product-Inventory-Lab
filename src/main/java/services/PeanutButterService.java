package services;

import models.PeanutButter;

import java.util.*;

public class PeanutButterService {

    private static int nextId = 1;

    private List<PeanutButter> inventory = new ArrayList<>();

    public PeanutButter create (String brand, String type, int quantity, double price){

        PeanutButter newPB = new PeanutButter(brand, type, quantity, price, nextId++);

        inventory.add(newPB);
        return newPB;
    }

    public PeanutButter[] findAll(){
        return inventory.toArray(new PeanutButter[0]);
    }

    public PeanutButter findPB(int id){
        for (int i = 0; i <= inventory.size(); i++) {
            if (inventory.get(i).getId() == id) return inventory.get(i);
        }
        return null;
    }

    public void removePB(int id){
        for (int i = 0; i <= inventory.size(); i++) {
            if (inventory.get(i).getId() == id) inventory.remove(i);
        }
    }


}

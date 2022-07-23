package services;

import models.Cracker;
import models.PeanutButter;

import java.util.ArrayList;
import java.util.List;

public class CrackerService {

    private static int nextId = 1;

    private List<Cracker> inventory = new ArrayList<>();

    public Cracker create (String brand, String type, int quantity, double price){

        Cracker newC = new Cracker(brand, type, quantity, price, nextId++);

        inventory.add(newC);
        return newC;
    }

    public Cracker[] findAll(){
        return inventory.toArray(new Cracker[0]);
    }

    public Cracker findC(int id){
        for (int i = 0; i <= inventory.size(); i++) {
            if (inventory.get(i).getId() == id) return inventory.get(i);
        }
        return null;
    }

    public void removeC(int id){
        for (int i = 0; i <= inventory.size(); i++) {
            if (inventory.get(i).getId() == id) inventory.remove(i);
        }
    }

}

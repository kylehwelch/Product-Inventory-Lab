package services;

import models.Cracker;
import models.PeanutButter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrackerService {


    private static int nextId = 1;

    private List<Cracker> inventory = new ArrayList<>();

    public CrackerService() throws IOException {
    }

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

    public void theWriter() throws IOException {
        String csvFile = "~/dev/Product-Inventory-Lab/Crackers.csv";
        FileWriter writer = new FileWriter(csvFile);

        utils.CSVUtils.writeLine(writer, new ArrayList<String>(Arrays.asList(String.valueOf(nextId))));  // (2)

        for (Cracker s : inventory) {
            List<String> list = new ArrayList<>();
            list.add(s.getBrand());
            list.add(s.getType());
            list.add(String.valueOf(s.getQuantity()));
            list.add(String.valueOf(s.getPrice()));
            list.add(String.valueOf(s.getId()));

            utils.CSVUtils.writeLine(writer, list);
        }
        writer.flush();
        writer.close();
    }

    private void loadData(){
        // (1)
        String csvFile = "~/dev/Product-Inventory-Lab/Crackers.csv";
        String line = "";
        String csvSplitBy = ",";

        // (2)
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            nextId = Integer.parseInt(br.readLine());  // (3)

            while ((line = br.readLine()) != null) {
                // split line with comma
                String[] beer = line.split(csvSplitBy);

                // (4)
                String brand = beer[0];
                String type = beer[1];
                int quantity = Integer.parseInt(beer[2]);
                double price = Double.parseDouble(beer[3]);
                int id = Integer.parseInt(beer[4]);

                // (5)
                inventory.add(new Cracker(brand, type, quantity, price, id));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

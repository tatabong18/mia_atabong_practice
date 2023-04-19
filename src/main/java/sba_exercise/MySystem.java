package sba_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MySystem {
    private Map<String, Item> myItemsInHashMap;

    public MySystem() {
        myItemsInHashMap = new HashMap<>();
        try {
            File file = new File("sample.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] items = line.split("\\s{2}");
                String name = items[0];
                String description = items[1];
                double price = Double.parseDouble(items[2]);
                int quantity = Integer.parseInt(items[3]);
                Item item = new Item(name, description, price, quantity);
                myItemsInHashMap.put(name, item);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // just propagating to default exception handler
        }
    }

    public Map<String, Item> getMyItemsInHashMap() {
        return myItemsInHashMap;
    }

    public void setMyItemsInHashMap(Map<String, Item> myItemsInHashMap) {
        this.myItemsInHashMap = myItemsInHashMap;
    }

    public Item addItem(Item item) {
        if (myItemsInHashMap.containsKey(item.getItemName())) {
            System.out.println(item.getItemName() + " is already present. Cannot be added.");
            return null;
        } else {
            myItemsInHashMap.put(item.getItemName(), item);
            return item;
        }
    }

    public void displayItems() {
        for (Map.Entry<String, Item> entry : myItemsInHashMap.entrySet()) {
            Item item = entry.getValue();
            System.out.printf("%-20s%-20s%-10.2f%-10d\n", item.getItemName(), item.getItemDescription(),
                    item.getItemPrice(), item.getAvailableQuantity());
        }
    }

    public Item removeItem(String itemName) {
        Item removedItem = myItemsInHashMap.remove(itemName);
        if (removedItem == null) {
            System.out.println(itemName + " not found in the system.");
        }
        return removedItem;
    }
}

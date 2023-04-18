package sba_exercise;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Testing the constructor of MySystem class
        System.out.println("----------- Testing the constructor of MySystem class -----");
        MySystem mySystem = new MySystem();
        mySystem.displayItems();

        // Testing addItem method
        System.out.println("----------- Testing addItem(..) method -----");
        System.out.println("size before adding a new item = " + mySystem.getMyItemsInHashMap().size());
        Item newItem = new Item("oatmeal", "too healthy", 20.00, 10);
        Item addedItem = mySystem.addItem(newItem);
        if (addedItem != null) {
            System.out.println("size after adding a new item = " + mySystem.getMyItemsInHashMap().size());
            mySystem.displayItems();
        }

        System.out.println("size before adding an existing item = " + mySystem.getMyItemsInHashMap().size());
        Item existingItem = new Item("salad", "cobb salad", 15.50, 12);
        Item addedExistingItem = mySystem.addItem(existingItem);
        if (addedExistingItem == null) {
            System.out.println("size after adding an existing item = " + mySystem.getMyItemsInHashMap().size());
            mySystem.displayItems();
        }
    }
}

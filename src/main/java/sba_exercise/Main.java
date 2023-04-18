package sba_exercise;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("----------- Testing reading sample.txt -----");
//        System.out.printf("%-20s %-20s %-10s %-10s\n", "Name", "Description", "Price", "Quantity Available");
//        try {
//            File file = new File("sample.txt");
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                String[] items = line.split("\\s{2}");
//                String name = items[0];
//                String description = items[1];
//                double price = Double.parseDouble(items[2]);
//                int quantity = Integer.parseInt(items[3]);
//                System.out.printf("%-20s %-20s %-10.2f %-10d\n", name, description, price, quantity);
//            }
//            scanner.close();
//            // default exception handler
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------- Testing reading sample.txt -----");
        System.out.printf("%-20s %-20s %-10s %-10s\n",
                "Name", "Description", "Price", "Quantity Available");
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
                System.out.printf("%-20s %-20s %-10.2f %-10d\n",
                        name, description, price, quantity);
            }
            scanner.close();
            // default exception handler
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\n----------- Testing the constructor " +
                "of Item class -----");
        Item item = new Item("Jollof Rice",
                "Very yummy",
                16.00,
                12);
        System.out.printf("%-20s %-20s %-10.2f %-10d %-10d\n",
                item.getItemName(),
                item.getItemDescription(),
                item.getPrice(),
                item.getQuantity(),
                item.getAvailableQuantity());
    }
}

package sba_exercise;

import java.io.File;
import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------- Testing reading sample.txt -----");
        System.out.printf("%-20s%-20s%-10s%-20s%n",
                "Name", "Description", "Price", "Quantity Available");
        try {
            File file = new File("sample.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split("  ");
                String itemName = fields[0];
                String itemDescription = fields[1];
                double itemPrice = Double.parseDouble(fields[2]);
                int availableQuantity = Integer.parseInt(fields[3]);
                System.out.printf("%-20s%-20s%-10.2f%-20d%n",
                        itemName, itemDescription, itemPrice,
                        availableQuantity);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // Propagate FileNotFoundException
            throw new RuntimeException(e);
        }
    }
}

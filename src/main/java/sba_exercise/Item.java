package sba_exercise;
public class Item {
    private String itemName;
    private String itemDescription;
    private Double price;
    private Integer quantity;
    private Integer availableQuantity;

    // Default constructor
    public Item() {
        this.quantity = 1;
    }

    // Constructor with 4 arguments
    public Item(String itemName, String itemDescription, Double price, Integer availableQuantity) {
        this(); // Calling default constructor
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    // Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an instance of Item with test data
        Item item = new Item("noodle", "really good", 20.00, 20);

        // Displaying the item details
        System.out.println("----------- Testing the constructor of Item class -----");
        System.out.printf("%-20s%-20s%-10.2f%-10d%-10d%n",
                item.getItemName(),
                item.getItemDescription(),
                item.getPrice(),
                item.getQuantity(),
                item.getAvailableQuantity());
    }
}

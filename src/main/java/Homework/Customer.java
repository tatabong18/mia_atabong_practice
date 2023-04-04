package Homework;

public class Customer {

    private String customerName;
    private String address;
    private String email;
    private Product[] purchasedProducts;
    public Customer(String customerName, String address,
                    String email, Product[] purchasedProducts) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }
    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }
    public void setPurchasedProducts(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }
    public void getCustomerInfo() {
        System.out.println("Customer name: " + customerName);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Purchased products:");
        for (Product product : purchasedProducts) {
            System.out.println("- " + product.getProductName() + " (" + product.getPrice() + ")");
        }
    }

}

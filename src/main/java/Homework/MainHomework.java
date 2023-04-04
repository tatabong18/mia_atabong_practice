package Homework;

public class MainHomework {

    public static void main(String[] args) {
        Product product1 = new Product("TV", 19.99);
        Product product2 = new Product("Laptop", 21.99);
        Product[] purchasedProducts = {product1, product2};
        Customer customer = new Customer("Mona", "911 Broad St", "monica@gmail.com", purchasedProducts);
        customer.getCustomerInfo();
    }
}

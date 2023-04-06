package homework;

import contact_Package.Address;

public class MainHomework {

    public static void main(String[] args) {


        Product product1 = new Product("TV", 19.99);
        Product product2 = new Product("Laptop", 21.99);
        Product[] purchasedProducts = {product1, product2};
        Address address1 = new Address(true, 911,
                "Broad st", "Brooklyn", "NY");
        Address address2 = new Address(false, 419,
                "Main st", "Bushwick", "NJ");
        Address address3 = new Address(false, 420,
                "Bond st", "Bedstuy", "TN");
        Customer customer = new Customer(new CustomerName("Mona",
                "Lisa", "Poodle"),
                "Mona@xyz.com", purchasedProducts);
        customer.addAddress(address1);
        customer.addAddress(address2);
        customer.addAddress(address3);
        customer.getCustomerInfo();

    }
}

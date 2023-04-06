package homework;

import contact_Package.Address;

public class Customer {

    public CustomerName getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(CustomerName customer_name) {
        this.customer_name = customer_name;
    }

    private CustomerName customer_name;
    private String email;
    private Product[] purchasedProducts;
    private static Address[] customerAddress = new Address[10];
    private int trackAddressIndex;

    public Customer(CustomerName customer_name,
                    String email, Product[] purchasedProducts) {

        this.email = email;
        this.purchasedProducts = purchasedProducts;
        this.customer_name = customer_name;

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
        customer_name.getFullName();
        System.out.println("Email: " + email);
//        System.out.println(customerAddress[0].getStreetNumber() + " " +
//                customerAddress[0].getStreetName() + " " +
//                customerAddress[0].getCity() + " " +
//                customerAddress[0].getState());
//        System.out.println(customerAddress[1].getStreetNumber() + " " +
//                customerAddress[1].getStreetName() + " " +
//                customerAddress[1].getCity() + " " +
//                customerAddress[1].getState());
        for (Address address: customerAddress){
            if(address == null){
                break;
            }
            System.out.println(address.getStreetNumber() + " " +
               address.getStreetName() + " " +
                address.getCity() + " " +
                address.getState());
        }
        System.out.println("Purchased products:");
        for (Product product : purchasedProducts) {
            System.out.println("- " + product.getProductName() +
                    " (" + product.getPrice() + ")");

        }
    }

    public void addAddress(Address address) {
        this.customerAddress[trackAddressIndex++] = address;

    }

}

package homework;

import contact_Package.Address;

public class Customer {

    private String FirstName;
    private String email;
    private Product[] purchasedProducts;
    private static Address[] customerAddress = new Address[10];
    private int trackAddressIndex;

    public Customer(String customerName,
                    String email, Product[] purchasedProducts) {

        this.email = email;
        this.purchasedProducts = purchasedProducts;

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

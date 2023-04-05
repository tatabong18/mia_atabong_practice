package contact_Package;

public class Address {
    private boolean isPrimaryAddress;
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;

    // Constructor
    public Address(boolean isPrimaryAddress, int streetNumber, String streetName, String city, String state) {
        this.isPrimaryAddress = isPrimaryAddress;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }

    // Getters and Setters
    public boolean isPrimaryAddress() {
        return isPrimaryAddress;
    }

    public void setPrimaryAddress(boolean primaryAddress) {
        isPrimaryAddress = primaryAddress;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // toString() method for printing Address object
    @Override
    public String toString() {
        return "Address{" +
                "isPrimaryAddress=" + isPrimaryAddress +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
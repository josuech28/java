package excercises.address;

/**
 * Created by joschinc on 10/31/16.
 */
public class Address {

    // Attributes
    private String country;
    private String city;
    private String street;
    private int zipCode;

    // Constructors
    public Address(){
        this.country = "";
        this.city = "";
        this.street = "";
        this.zipCode = 0;
    }

    public  Address(String country, String city, String street, int zipCode){
        this.country = country;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    // Setters && Getters
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    // Print
    public void printAddress(){
        System.out.println("Country: " + this.getCountry());
        System.out.println("City: " + this.getCity());
        System.out.println("Street: " + this.getStreet());
        System.out.println("ZIP Code: " + this.getZipCode());
    }
}

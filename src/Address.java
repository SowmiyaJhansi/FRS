import java.sql.SQLOutput;

class Address extends Passenger
{
     private String street;
     private String city;
     private String state;

    public Address()
    {
        super();
    }

    public Address(String street, String city, String state) {
        super();
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() { return state; }

    public void setState(String state) {
        this.state = state;
    }

public String getAddressDetails()
{
    System.out.println("Street:"+getStreet());
    System.out.println("City:"+getCity());
    System.out.println("State:"+getState());
    return "Street:"+getStreet()+" "+"City:"+getCity()+"State:"+getState();
}
public void updateAddressDetails(String addressDetails)
{
    super.getAddress();
}
}

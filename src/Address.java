public class Address extends Passenger
{
     private String street;
     private String city;
     private String state;

    Address() {

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




}

public class Passenger extends Ticket
{
    private static int idCounter;
    private Address address;
    private Contact contact;

    public Passenger(int id)
    {
        for(int i=0; idCounter>=0; idCounter++)
        {
            idCounter=id;

        }
    }

    public Passenger(int id, Address address, Contact contact) {
        idCounter = id;
        this.address = address;
        this.contact = contact;
    }

    public Passenger(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, int id, Address address, Contact contact) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled);
        idCounter = id;
        this.address = address;
        this.contact = contact;
    }

    public Passenger() {
        super();
    }

    public int getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(int idCounter) {
        Passenger.idCounter = idCounter;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void getAddress(Address address) {
        this.address = address;
    }

    public void getContact(Contact contact) {
        this.contact = contact;
    }


    }

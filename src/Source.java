public class Source
{
public static void main(String[] args)
{
    Contact contact=new Contact("Sowmi", "0123456789", "sowmi@gmail.com");
    contact.getContactDetails();

    Address addr=new Address("LIC Colony", "Chennai", "Tamilnadu");
    addr.getAddressDetails();

    Flight flight=new Flight("0123", "Chennai", "Bangalore","13:00","15:00", "01234",2500.00f, false, "1236547", "SpiceJet", 300, 250 );
    Flight.getFlightDetails();
    Flight.getCheckStatus();

    final Ticket pnr=new Passenger()
    {
        public void printTicketDetails()
        {
            System.out.println("PNR No:"+ getPnr());
        }
    };
}
}


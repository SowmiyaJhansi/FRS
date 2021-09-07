public class TouristTicket extends Ticket
{
    public String hotelAddress;
    private String selectedTouristLocation;

    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String hotelAddress, String selectedTouristLocation) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public TouristTicket(String hotelAddress, String selectedTouristLocation) {
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public TouristTicket() {
        super();
    }


    public String toString() {
        return "TouristTicket{" +
                "cancelled=" + cancelled +
                ", hotelAddress='" + hotelAddress + '\'' +
                ", selectedTouristLocation='" + selectedTouristLocation + '\'' +
                '}';
    }
}

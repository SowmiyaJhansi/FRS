public class Flight extends Ticket {
    private static String flightNo;
    private static String airline;
    public static int capacity;
    public static int bookedSeats;

    public Flight(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String flightNo, String airline, int capacity, int bookedSeats) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled);
        Flight.flightNo = flightNo;
        Flight.airline = airline;
        Flight.capacity = capacity;
        Flight.bookedSeats = bookedSeats;

    }

    public static String getFlightNo() {
        return flightNo;
    }


    public void setFlightNo(String flightNo) {
        if((flightNo.matches("[a-zA-z]+$")) && (flightNo.length() == 3)) {
            Flight.flightNo = flightNo;
        }else {
            System.out.println("Invalid flight number");
        }
    }

    public static String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        if (airline.matches("[a-zA-Z]+$")) {
            Flight.airline = airline;
        } else {
            System.out.println("Invalid airline");
        }}

        public static int getCapacity() {
            return capacity;
        }

        public void setCapacity ( int capacity){
            if (capacity <= 300) {
                Flight.capacity = capacity;
            } else {
                System.out.println("No capacity");
            }
        }

        public static int getBookedSeats() {
            return bookedSeats;
        }

        public void setBookedSeats ( int bookedSeats){
            Flight.bookedSeats = bookedSeats;
        }
public static String getFlightDetails()
{
    System.out.println("FlightNo:"+getFlightNo());
    System.out.println("Airline:"+getAirline());
    System.out.println("Capacity:"+getCapacity());
    System.out.println("Booked Seats:"+getBookedSeats());
    return "FlightNo:"+getFlightNo()+" "+"Airline:"+getAirline()+" "+"Capacity:"+getCapacity()+" "+"BookedSeats:"+getBookedSeats();
}
public boolean checkAvailability()
{
    if(getCapacity() == 0)
    {
        return true;
    }else
    {
        return false;
    }
}
public void incrementBookingCounter()
{

}

    public static String getCheckStatus() {
        System.out.println("PNR No:"+getPnr());
        System.out.println("From:"+getFrom());
        System.out.println("To:"+getTo());
        System.out.println("DepartureDateTime:"+getDepartureDateTime());
        System.out.println("ArrivalDateTime:"+getArrivalDateTime());
        System.out.println("Seat No:"+getSeatNo());
        System.out.println("Price:"+getPrice());
        System.out.println("Cancelled:"+isCancelled());
         return "Ticket{" +
                    "pnr='" + pnr + '\'' +
                    ", from='" + from + '\'' +
                    ", to='" + to + '\'' +
                    ", departureDateTime='" + departureDateTime + '\'' +
                    ", arrivalDateTime='" + arrivalDateTime + '\'' +
                    ", seatNo='" + seatNo + '\'' +
                    ", price=" + price +
                    ", cancelled=" + cancelled +
                    '}';
        }

    String ticket() {
        return null;
    }
}
public class Flight extends Ticket {
    private String flightNo;
    private String airline;
    public int capacity;
    public int bookedSeats;

    public Flight(String flightNo, String airline, int capacity, int bookedSeats) {
        this.flightNo = flightNo;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public Flight(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String flightNo, String airline, int capacity, int bookedSeats) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled);
        this.flightNo = flightNo;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        if((flightNo.matches("[a-zA-z]+$")) && (flightNo.length() == 3)) {
            this.flightNo = flightNo;
        }else {
            System.out.println("Invalid flight number");
        }
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        if (airline.matches("[a-zA-Z]+$")) {
            this.airline = airline;
        } else {
            System.out.println("Invalid airline");
        }}

        public int getCapacity () {
            return capacity;
        }

        public void setCapacity ( int capacity){
            if (capacity <= 300) {
                this.capacity = capacity;
            } else {
                System.out.println("No capacity");
            }
        }

        public int getBookedSeats () {
            return bookedSeats;
        }

        public void setBookedSeats ( int bookedSeats){
            this.bookedSeats = bookedSeats;
        }
    }
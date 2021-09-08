public class RegularTicket extends Ticket
{
    public String specialServices;

    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String specialServices) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled);
        this.specialServices = specialServices;
    }

    public RegularTicket(String specialServices) {
        this.specialServices = specialServices;
    }

    public String getSpecialServices()
    {
        //System.out.println("Special Services:"+getSpecialServices());
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    String ticket() {
        return null;
    }

    public String toString() {
        return "RegularTicket{" +
                "specialServices='" + specialServices + '\'' +
                ", cancelled=" + cancelled +
                '}';
    }

    public String checkStatus()
    {
        System.out.println("PNR NO:0123"+getPnr());
        System.out.println("From:Chennai"+getFrom());
        System.out.println("To:Bangalore"+getTo());
        System.out.println("DepartureDateTime:13.00"+getDepartureDateTime());
        System.out.println("ArrivalDateTime:15.00"+getArrivalDateTime());
        System.out.println("SeatNo:01234"+getSeatNo());
        System.out.println("Price:2500.00"+getPrice());
        System.out.println("Cancelled:false"+isCancelled());
        return checkStatus();

    }

}

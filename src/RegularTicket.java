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

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    public String toString() {
        return "RegularTicket{" +
                "specialServices='" + specialServices + '\'' +
                ", cancelled=" + cancelled +
                '}';
    }
}

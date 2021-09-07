abstract public class Ticket
{
    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    public boolean cancelled;

    public Ticket() {

    }



    public Ticket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        if(pnr.matches("[0-10]+$") && pnr.length()<=10){
            this.pnr = pnr;
            System.out.println("Invalid PNR");
        }
        else{
            System.out.println("Valid PNR");
        }

    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        if(from.matches("[a-zA-Z]+$") && from.length()<=10){
            this.from = from;
            System.out.println("Valid Departure");
        }
        else{
            System.out.println("Invalid Departure");
        }
            }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        if(to.matches("[a-zA-Z]+$") && to.length()<=10){
            this.to = to;
            System.out.println("Valid Arrival");
        }
        else{
            System.out.println("Invalid Arrival");
        }
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        if(seatNo.matches("[a-zA-Z0-9]+$") && seatNo.length()<=10){
            this.seatNo = seatNo;
            System.out.println("Invalid Seat Number");
              }
        else{
            System.out.println("Valid Seat Number");
        }


    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {

        this.price = price;
    }

        public boolean isCancelled(boolean b) {
            return cancelled;
        }

        public void setCancelled(boolean cancelled) {
            this.cancelled = cancelled;
        }
    public String toString() {
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
}

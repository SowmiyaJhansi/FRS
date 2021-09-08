abstract public class Ticket
{
    static String pnr;
    static String from;
    static String to;
    static String departureDateTime;
    static String arrivalDateTime;
    static String seatNo;
    static float price;
    public static boolean cancelled;

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

    public static String getPnr() {
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

    public static String getFrom() {
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

    public static String getTo() {
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

    public static String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public static String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public static String getSeatNo() {
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

    public static float getPrice() {
        return price;
    }

    public void setPrice(float price) {

        this.price = price;
    }

        public static boolean isCancelled() {
            return cancelled;
        }

        public void setCancelled(boolean cancelled) {
            this.cancelled = cancelled;
        }

        public int getFlightDuration()
        {
            String[] sArray=departureDateTime.split(":");
            String a1=sArray[0];
            String a2=sArray[1];
            String a3=a1.concat(a2);
            int intDepart = Integer.parseInt(a3);
            System.out.println(intDepart);

            String[] sArr=arrivalDateTime.split(":");
            String i1=sArr[0];
            String i2=sArr[1];
            String i3=i1.concat(i2);
            int intArrival = Integer.parseInt(i3);
            System.out.println(intArrival);

            return intDepart;
        }
abstract String ticket();

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

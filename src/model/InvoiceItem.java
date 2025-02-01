package model;

/**
 *
 * @author Laky
 */
public class InvoiceItem {

    private String TicketID;
    private String CustomerNum;
    private String Moviename;
    private String HallNo;
    private String StartTime;
    private String sheetNo;
    private double TicketPrice;

    public String getTicketID() {
        return TicketID;
    }

    public void setTicketID(String TicketID) {
        this.TicketID = TicketID;
    }

    public String getCustomerNum() {
        return CustomerNum;
    }
    
    public void setCustomerNum(String CustomerNum) {
        this.CustomerNum = CustomerNum;
    }

    public String getMoviename() {
        return Moviename;
    }
    
    public void setMoviename(String Moviename) {
        this.Moviename = Moviename;
    }

    public String getHallNo() {
        return HallNo;
    }
    
    public void setHallNo(String HallNo) {
        this.HallNo = HallNo;
    }

    public String getStartTime() {
        return StartTime;
    }
    
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public String getsheetNo() {
        return sheetNo;
    }
    
    public void setsheetNo(String sheetNo) {
        this.sheetNo = sheetNo;
    }

    public double getTicketPrice() {
        return TicketPrice;
    }
    
    public void setTicketPrice(double TicketPrice) { // Changed the return type to void
        this.TicketPrice = TicketPrice;
    }
}

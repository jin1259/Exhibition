package bookingexhibition;

public class CompletedPayment extends AbstractEvent {

    String eventType;
    
    Long id;    //private
    Long bookingId;  //private
    String bookingStatus;   //private
    Long amt;   //private

    // PMJ Start -- jym
    public CompletedPayment() {
        this.eventType = this.getClass().getSimpleName();
    }

    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    // PMJ End

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Long getAmt() {
        return amt;
    }

    public void setAmt(Long amt) {
        this.amt = amt;
    }
}
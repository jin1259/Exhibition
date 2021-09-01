package bookingexhibition;

public class RegisteredExhibiton extends AbstractEvent {

    String eventType;

    Long id;    //private 
    String date;    //private 
    String time;   //private 
    Integer audienceCnt;    //private 
    String title;   //private 


    public RegisteredExhibiton(){
        //super();
        this.eventType = this.getClass().getSimpleName();
    }

    // PMJ Start 
    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    //PMJ End

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public Integer getAudienceCnt() {
        return audienceCnt;
    }

    public void setAudienceCnt(Integer audienceCnt) {
        this.audienceCnt = audienceCnt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
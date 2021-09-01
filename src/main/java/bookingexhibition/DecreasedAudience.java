package bookingexhibition;

public class DecreasedAudience extends AbstractEvent {
    
    String eventType;

    Long id;    //private 
    String date;    //private 
    Integer time;   //private 
    Integer audienceCnt;    //private 
    String title;   //private 

    public DecreasedAudience(){
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

    public Integer getAudienceCnt() {
        return audienceCnt;
    }

    public void setAudienceCnt(Integer audienceCnt) {
        this.audienceCnt = audienceCnt;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
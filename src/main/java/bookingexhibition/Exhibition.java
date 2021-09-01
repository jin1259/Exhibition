package bookingexhibition;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Exhibition_table")
public class Exhibition {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String date;
    private Integer time;
    private Integer audienceCnt;
    private String title;

    @PostPersist
    public void onPostPersist(){
        RegisteredExhibiton registeredExhibiton = new RegisteredExhibiton();
        BeanUtils.copyProperties(this, registeredExhibiton);
        registeredExhibiton.publishAfterCommit();

    }

    @PostUpdate
    public void onPostUpdate(){
        IncreasedAudience increasedAudience = new IncreasedAudience();
        BeanUtils.copyProperties(this, increasedAudience);
        increasedAudience.publishAfterCommit();

    }
    
    @PreRemove
    public void onPreRemove(){
        DecreasedAudience decreasedAudience = new DecreasedAudience();
        BeanUtils.copyProperties(this, decreasedAudience);
        decreasedAudience.publishAfterCommit();

    }

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
    
    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
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
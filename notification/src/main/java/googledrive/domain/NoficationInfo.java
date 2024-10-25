package googledrive.domain;

import googledrive.NotificationApplication;
import googledrive.domain.StatusNotified;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "NoficationInfo_table")
@Data
//<<< DDD / Aggregate Root
public class NoficationInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String notificationStatus;

    @PostPersist
    public void onPostPersist() {
        StatusNotified statusNotified = new StatusNotified(this);
        statusNotified.publishAfterCommit();
    }

    public static NoficationInfoRepository repository() {
        NoficationInfoRepository noficationInfoRepository = NotificationApplication.applicationContext.getBean(
            NoficationInfoRepository.class
        );
        return noficationInfoRepository;
    }

    //<<< Clean Arch / Port Method
    public static void notify(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        NoficationInfo noficationInfo = new NoficationInfo();
        repository().save(noficationInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(noficationInfo->{
            
            noficationInfo // do something
            repository().save(noficationInfo);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void notify(VideoProcessed videoProcessed) {
        //implement business logic here:

        /** Example 1:  new item 
        NoficationInfo noficationInfo = new NoficationInfo();
        repository().save(noficationInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(videoProcessed.get???()).ifPresent(noficationInfo->{
            
            noficationInfo // do something
            repository().save(noficationInfo);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root

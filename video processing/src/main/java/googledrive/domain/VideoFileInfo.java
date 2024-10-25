package googledrive.domain;

import googledrive.VideoProcessingApplication;
import googledrive.domain.VideoProcessed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "VideoFileInfo_table")
@Data
//<<< DDD / Aggregate Root
public class VideoFileInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String videoStreamUrl;

    @PostPersist
    public void onPostPersist() {
        VideoProcessed videoProcessed = new VideoProcessed(this);
        videoProcessed.publishAfterCommit();
    }

    public static VideoFileInfoRepository repository() {
        VideoFileInfoRepository videoFileInfoRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoFileInfoRepository.class
        );
        return videoFileInfoRepository;
    }

    //<<< Clean Arch / Port Method
    public static void ifVideoThenVideoStreaming(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        VideoFileInfo videoFileInfo = new VideoFileInfo();
        repository().save(videoFileInfo);

        VideoProcessed videoProcessed = new VideoProcessed(videoFileInfo);
        videoProcessed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(videoFileInfo->{
            
            videoFileInfo // do something
            repository().save(videoFileInfo);

            VideoProcessed videoProcessed = new VideoProcessed(videoFileInfo);
            videoProcessed.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root

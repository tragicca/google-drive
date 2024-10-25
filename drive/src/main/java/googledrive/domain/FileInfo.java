package googledrive.domain;

import googledrive.DriveApplication;
import googledrive.domain.FileUploaded;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FileInfo_table")
@Data
//<<< DDD / Aggregate Root
public class FileInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileName;

    private Long fileSize;

    private String uploadStatus;

    private String userId;

    @PostPersist
    public void onPostPersist() {
        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();
    }

    public static FileInfoRepository repository() {
        FileInfoRepository fileInfoRepository = DriveApplication.applicationContext.getBean(
            FileInfoRepository.class
        );
        return fileInfoRepository;
    }
}
//>>> DDD / Aggregate Root

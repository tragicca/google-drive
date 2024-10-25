package googledrive.domain;

import googledrive.IndexerApplication;
import googledrive.domain.FileIndexed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "IndexedFile_table")
@Data
//<<< DDD / Aggregate Root
public class IndexedFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fileName;

    private String indexStatus;

    @PostPersist
    public void onPostPersist() {
        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();
    }

    public static IndexedFileRepository repository() {
        IndexedFileRepository indexedFileRepository = IndexerApplication.applicationContext.getBean(
            IndexedFileRepository.class
        );
        return indexedFileRepository;
    }

    //<<< Clean Arch / Port Method
    public static void fileIndexing(FileUploaded fileUploaded) {
        //implement business logic here:

        /** Example 1:  new item 
        IndexedFile indexedFile = new IndexedFile();
        repository().save(indexedFile);

        FileIndexed fileIndexed = new FileIndexed(indexedFile);
        fileIndexed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(indexedFile->{
            
            indexedFile // do something
            repository().save(indexedFile);

            FileIndexed fileIndexed = new FileIndexed(indexedFile);
            fileIndexed.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root

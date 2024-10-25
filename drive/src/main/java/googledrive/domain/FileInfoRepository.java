package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "fileInfos", path = "fileInfos")
public interface FileInfoRepository
    extends PagingAndSortingRepository<FileInfo, Long> {}

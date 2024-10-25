package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "videoFileInfos",
    path = "videoFileInfos"
)
public interface VideoFileInfoRepository
    extends PagingAndSortingRepository<VideoFileInfo, Long> {}

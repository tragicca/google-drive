package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "noficationInfos",
    path = "noficationInfos"
)
public interface NoficationInfoRepository
    extends PagingAndSortingRepository<NoficationInfo, Long> {}

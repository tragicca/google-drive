package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "indexedFiles",
    path = "indexedFiles"
)
public interface IndexedFileRepository
    extends PagingAndSortingRepository<IndexedFile, Long> {}

package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class IndexedFileHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<IndexedFile>> {

    @Override
    public EntityModel<IndexedFile> process(EntityModel<IndexedFile> model) {
        return model;
    }
}

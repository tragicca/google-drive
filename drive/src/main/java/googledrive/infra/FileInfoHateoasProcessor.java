package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FileInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<FileInfo>> {

    @Override
    public EntityModel<FileInfo> process(EntityModel<FileInfo> model) {
        return model;
    }
}

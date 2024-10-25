package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class VideoFileInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<VideoFileInfo>> {

    @Override
    public EntityModel<VideoFileInfo> process(
        EntityModel<VideoFileInfo> model
    ) {
        return model;
    }
}

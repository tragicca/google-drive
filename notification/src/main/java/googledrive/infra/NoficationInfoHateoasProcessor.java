package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class NoficationInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<NoficationInfo>> {

    @Override
    public EntityModel<NoficationInfo> process(
        EntityModel<NoficationInfo> model
    ) {
        return model;
    }
}

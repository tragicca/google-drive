package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class StatusNotified extends AbstractEvent {

    private Long id;
    private String notificationStatus;

    public StatusNotified(NoficationInfo aggregate) {
        super(aggregate);
    }

    public StatusNotified() {
        super();
    }
}
//>>> DDD / Domain Event

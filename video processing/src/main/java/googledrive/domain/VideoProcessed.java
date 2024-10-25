package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String videoStreamUrl;

    public VideoProcessed(VideoFileInfo aggregate) {
        super(aggregate);
    }

    public VideoProcessed() {
        super();
    }
}
//>>> DDD / Domain Event

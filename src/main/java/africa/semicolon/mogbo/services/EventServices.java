package africa.semicolon.mogbo.services;

import africa.semicolon.mogbo.data.models.Event;
import africa.semicolon.mogbo.data.models.Event;
import org.springframework.stereotype.Service;

@Service
public interface EventServices {
    Event saveEvent(Event event);
}

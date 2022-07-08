package africa.semicolon.mogbo.services;

import africa.semicolon.mogbo.data.models.Event;
import africa.semicolon.mogbo.data.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServicesImpl implements EventServices {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }
}

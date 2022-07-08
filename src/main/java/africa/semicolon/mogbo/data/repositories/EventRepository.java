package africa.semicolon.mogbo.data.repositories;

import africa.semicolon.mogbo.data.models.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {
}

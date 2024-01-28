package swagger.repository;

import swagger.entity.Swag;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwagRepository  extends MongoRepository<Swag, String> {
}

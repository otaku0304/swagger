package swagger.repository;

import swagger.entity.Swagger;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwaggerRepository extends MongoRepository<Swagger, String> {
}

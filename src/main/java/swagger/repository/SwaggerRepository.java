package swagger.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import swagger.entity.Swagger;


@Repository
public interface SwaggerRepository extends MongoRepository<Swagger, String> {
}

package swagger.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import swagger.entity.Swagger;

import java.io.Serializable;

@Repository
public interface SwaggerRepository extends MongoRepository<Swagger, Serializable> {
}

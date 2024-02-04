package swagger.service;

import swagger.converter.SwaggerConverter;
import swagger.dto.HttpResponseDTO;
import swagger.dto.SwaggerDTO;
import swagger.entity.Swagger;
import swagger.repository.SwaggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class SwaggerService {

    private final SwaggerRepository swaggerRepository;
    @Autowired
    public SwaggerService(SwaggerRepository swaggerRepository){
        this.swaggerRepository = swaggerRepository;
    }

    public HttpResponseDTO saveSwagger(final SwaggerDTO swagDTO) {
        HttpResponseDTO httpResponseDTO = new HttpResponseDTO();
        Swagger swag = swaggerRepository.save(SwaggerConverter.convertSwagDTOtoEntity(swagDTO));
        if (!ObjectUtils.isEmpty(swag)) {
            httpResponseDTO.setResponseCode(201);
            httpResponseDTO.setResponseMessage("Swag Saved successfully");
        } else {
            httpResponseDTO.setResponseCode(400);
            httpResponseDTO.setResponseMessage("BAD Request");
            return httpResponseDTO;
        }
        return httpResponseDTO;
    }
}

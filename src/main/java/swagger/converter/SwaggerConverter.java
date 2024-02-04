package swagger.converter;

import swagger.dto.SwaggerDTO;
import swagger.entity.Swagger;
import swagger.utils.Utility;

public class SwaggerConverter {

    private SwaggerConverter() {
        throw new IllegalStateException("SwaggerConverter class");
    }

    public static Swagger convertSwagDTOtoEntity(final SwaggerDTO swagDTO) {
        return Swagger.builder()
                .swagContent(swagDTO.getSwagContent())
                .user(swagDTO.getUser())
                .genericDetails(Utility.createGenericDetails(swagDTO.getUser()))
                .build();
    }
}

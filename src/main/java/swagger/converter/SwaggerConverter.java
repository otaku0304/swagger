package swagger.converter;

import swagger.dto.SwaggerDTO;
import swagger.entity.Swagger;

public class SwaggerConverter {

    private SwaggerConverter() {
        throw new IllegalStateException("SwagConverter class");
    }

    public static Swagger convertSwagDTOtoEntity(final SwaggerDTO swagDTO) {
        return Swagger.builder()
                .swagContent(swagDTO.getSwagContent())
                .user(swagDTO.getUser())
                //.genericDetails(utility.createGenericDetails(swagDTO.getUser()))
                .build();

    }
}

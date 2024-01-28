package swagger.converter;

import swagger.dto.SwagDTO;
import swagger.entity.Swag;

public class SwagConverter {

    public static Swag convertSwagDTOtoEntity(final SwagDTO swagDTO) {
        return Swag.builder()
                .swagContent(swagDTO.getSwagContent())
                .user(swagDTO.getUser())
                //.genericDetails(utility.createGenericDetails(swagDTO.getUser()))
                .build();

    }
}

package com.swag.swag.converter;

import com.swag.swag.dto.SwagDTO;
import com.swag.swag.entity.Swag;

public class SwagConverter {

    public static Swag convertSwagDTOtoEntity(final SwagDTO swagDTO) {
        return Swag.builder()
                .swagContent(swagDTO.getSwagContent())
                .user(swagDTO.getUser())
                //.genericDetails(utility.createGenericDetails(swagDTO.getUser()))
                .build();

    }
}

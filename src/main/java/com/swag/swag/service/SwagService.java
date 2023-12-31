package com.swag.swag.service;

import com.swag.swag.converter.SwagConverter;
import com.swag.swag.dto.HttpResponseDTO;
import com.swag.swag.dto.SwagDTO;
import com.swag.swag.entity.Swag;
import com.swag.swag.repository.SwagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class SwagService {
    @Autowired
    private SwagRepository swagRepository;

    public HttpResponseDTO saveSWAG(final SwagDTO swagDTO) {
        HttpResponseDTO httpResponseDTO = new HttpResponseDTO();
        Swag swag = swagRepository.save(SwagConverter.convertSwagDTOtoEntity(swagDTO));
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

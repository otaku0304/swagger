package swagger.service;

import swagger.converter.SwagConverter;
import swagger.dto.HttpResponseDTO;
import swagger.dto.SwagDTO;
import swagger.entity.Swag;
import swagger.repository.SwagRepository;
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

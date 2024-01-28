package swagger.controller;

import swagger.dto.HttpResponseDTO;
import swagger.dto.SwagDTO;
import swagger.service.SwagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/swag")
class SwagController {
    @Autowired
    SwagService swagService;

    @PostMapping(value = "/save-swag")
    public ResponseEntity<HttpResponseDTO> saveSwag(@RequestBody SwagDTO swagDTO) {
        HttpResponseDTO httpResponseDTO = swagService.saveSWAG(swagDTO);
        if (httpResponseDTO.getResponseCode() == 201) {
            return new ResponseEntity<>(httpResponseDTO, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(httpResponseDTO, HttpStatus.BAD_REQUEST);
        }
    }
}


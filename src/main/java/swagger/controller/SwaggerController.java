package swagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import swagger.dto.HttpResponseDTO;
import swagger.dto.SwaggerDTO;
import swagger.service.SwaggerService;

@CrossOrigin
@RestController
@RequestMapping("/swagger")
class SwaggerController {

    private final SwaggerService swaggerService;

    @Autowired
    private SwaggerController(SwaggerService swaggerService) {
        this.swaggerService = swaggerService;
    }

    @PostMapping(value = "/save-swagger")
    public ResponseEntity<HttpResponseDTO> saveSwagger(@RequestBody SwaggerDTO swagDTO) {
        HttpResponseDTO httpResponseDTO = swaggerService.saveSwagger(swagDTO);
        if (httpResponseDTO.getResponseCode() == 201) {
            return new ResponseEntity<>(httpResponseDTO, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(httpResponseDTO, HttpStatus.BAD_REQUEST);
        }
    }
}


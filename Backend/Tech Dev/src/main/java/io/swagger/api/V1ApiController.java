package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.model.ComentarioDto;
import io.swagger.model.ErrorDto;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.LugarDto;
import io.swagger.negocio.ComentarioService;
import io.swagger.negocio.LugarService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-25T20:53:21.707-05:00[America/Mexico_City]")
@RestController
public class V1ApiController implements V1Api {

    private static final Logger log = LoggerFactory.getLogger(V1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    ComentarioService comentarioService;
    
    @Autowired
    LugarService lugarService;

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse2001> getHotels() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{\r\n  \"hoteles\" : [ {\r\n    \"descripcion\" : \"Bulliciosa zona de moda con arquitectura colonial, el Jardín Centenario y el Museo Frida Kahlo.\",\r\n    \"latitud\" : \"19.34512356266588\",\r\n    \"tipo\" : \"Hotel\",\r\n    \"wifi\" : \"si\",\r\n    \"direccion\" : \"Calz. de Tlalpan 2043, Parque San Andrés, Coyoacán, 04040 Ciudad de México, CDMX\",\r\n    \"nombre\" : \"Hotel Finisterre\",\r\n    \"lavanderia\" : \"si\",\r\n    \"habitacion\" : \"si\",\r\n    \"longitud\" : \"-99.14457352718428\",\r\n    \"precio\" : 1500,\r\n    \"sitioWeb\" : \"http://www.hotelfinisterre.com.mx/\",\r\n    \"estacionamiento\" : \"si\",\r\n    \"piscina\" : \"si\",\r\n    \"mascotas\" : \"si\",\r\n    \"telefono\" : \"525556899544\"\r\n  }, {\r\n    \"descripcion\" : \"Bulliciosa zona de moda con arquitectura colonial, el Jardín Centenario y el Museo Frida Kahlo.\",\r\n    \"latitud\" : \"19.34512356266588\",\r\n    \"tipo\" : \"Hotel\",\r\n    \"wifi\" : \"si\",\r\n    \"direccion\" : \"Calz. de Tlalpan 2043, Parque San Andrés, Coyoacán, 04040 Ciudad de México, CDMX\",\r\n    \"nombre\" : \"Hotel Finisterre\",\r\n    \"lavanderia\" : \"si\",\r\n    \"habitacion\" : \"si\",\r\n    \"longitud\" : \"-99.14457352718428\",\r\n    \"precio\" : 1500,\r\n    \"sitioWeb\" : \"http://www.hotelfinisterre.com.mx/\",\r\n    \"estacionamiento\" : \"si\",\r\n    \"piscina\" : \"si\",\r\n    \"mascotas\" : \"si\",\r\n    \"telefono\" : \"525556899544\"\r\n  } ]\r\n}", InlineResponse2001.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> getPlace(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	LugarDto dto = lugarService.buscarPorId(lugarId);
            	return ResponseEntity
            			.status(HttpStatus.OK)
            			.body(dto);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> getPlaces() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\r\n  \"lugares\" : [ {\r\n    \"descripcion\" : \"Monumento de la revolucion\",\r\n    \"estado\" : \"CDMX\",\r\n    \"tipo\" : \"monumento\",\r\n    \"latitud\" : \"-99.0\",\r\n    \"longitud\" : \"12.0\",\r\n    \"precio\" : 50,\r\n    \"horarios\" : \"De 9 a 5 pm\",\r\n    \"municipio\" : \"Centro\",\r\n    \"id\" : \"12345678\",\r\n    \"nombre\" : \"Revolucion\",\r\n    \"comentarios\" : [ {\r\n      \"descripcion\" : \"Yo creo que...\",\r\n      \"fecha\" : \"fecha...\",\r\n      \"usuario\" : \"Rodrigo\"\r\n    }, {\r\n      \"descripcion\" : \"Yo creo que...\",\r\n      \"fecha\" : \"fecha...\",\r\n      \"usuario\" : \"Rodrigo\"\r\n    } ]\r\n  }, {\r\n    \"descripcion\" : \"Monumento de la revolucion\",\r\n    \"estado\" : \"CDMX\",\r\n    \"tipo\" : \"monumento\",\r\n    \"latitud\" : \"-99.0\",\r\n    \"longitud\" : \"12.0\",\r\n    \"precio\" : 50,\r\n    \"horarios\" : \"De 9 a 5 pm\",\r\n    \"municipio\" : \"Centro\",\r\n    \"id\" : \"12345678\",\r\n    \"nombre\" : \"Revolucion\",\r\n    \"comentarios\" : [ {\r\n      \"descripcion\" : \"Yo creo que...\",\r\n      \"fecha\" : \"fecha...\",\r\n      \"usuario\" : \"Rodrigo\"\r\n    }, {\r\n      \"descripcion\" : \"Yo creo que...\",\r\n      \"fecha\" : \"fecha...\",\r\n      \"usuario\" : \"Rodrigo\"\r\n    } ]\r\n  } ]\r\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> setComentarios(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ComentarioDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	LugarDto dto = comentarioService.agregarComentario(body, lugarId);
            	return ResponseEntity
            			.status(HttpStatus.OK)
            			.body(dto);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

}

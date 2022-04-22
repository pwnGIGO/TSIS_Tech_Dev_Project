package io.swagger.api;

import io.swagger.model.ComentarioDTO;
import io.swagger.model.ErrorDto;
import io.swagger.model.LugarDto;
import io.swagger.model.VueloDto;
import com.fasterxml.jackson.databind.ObjectMapper;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-22T16:08:57.773-05:00[America/Mexico_City]")
@RestController
public class V1ApiController implements V1Api {

    private static final Logger log = LoggerFactory.getLogger(V1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<VueloDto> deleteFly(@Parameter(in = ParameterIn.PATH, description = "Identificador del vuelo generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("vueloId") String vueloId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VueloDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"auerolinea\": \"Volaris\",\n  \"origen\":\"Aeropuerto Internacional de la Ciudad de México\",\n  \"destino\": \"Aeropuerto Internacional de Cancún\",\n  \"fechaSalida\": \"01-05-2022\",\n  \"horaSalida\":\"22:00\",\n  \"fechaLlegada\": \"01-05-2022\",\n  \"horaLlegada\":\"22:00\",\n  \"asiento\": \"A-01\",\n  \"precio\": 2000.00,\n  \"tipoEquipaje\": \"Básico\"\n}\"", VueloDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VueloDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VueloDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> deleteHotel(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> deletePlace(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> deleteRestaurant(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getComentarios(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VueloDto> getFlies() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VueloDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"auerolinea\": \"Volaris\",\n  \"origen\":\"Aeropuerto Internacional de la Ciudad de México\",\n  \"destino\": \"Aeropuerto Internacional de Cancún\",\n  \"fechaSalida\": \"01-05-2022\",\n  \"horaSalida\":\"22:00\",\n  \"fechaLlegada\": \"01-05-2022\",\n  \"horaLlegada\":\"22:00\",\n  \"asiento\": \"A-01\",\n  \"precio\": 2000.00,\n  \"tipoEquipaje\": \"Básico\"\n}\"", VueloDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VueloDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VueloDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VueloDto> getFly(@Parameter(in = ParameterIn.PATH, description = "Identificador del vuelo generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("vueloId") String vueloId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VueloDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"auerolinea\": \"Volaris\",\n  \"origen\":\"Aeropuerto Internacional de la Ciudad de México\",\n  \"destino\": \"Aeropuerto Internacional de Cancún\",\n  \"fechaSalida\": \"01-05-2022\",\n  \"horaSalida\":\"22:00\",\n  \"fechaLlegada\": \"01-05-2022\",\n  \"horaLlegada\":\"22:00\",\n  \"asiento\": \"A-01\",\n  \"precio\": 2000.00,\n  \"tipoEquipaje\": \"Básico\"\n}\"", VueloDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VueloDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VueloDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> getHotel(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody LugarDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> getHotels() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> getPlace(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> getPlaces() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> getRestaurant(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody LugarDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> getRestaurants() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VueloDto> patchFly(@Parameter(in = ParameterIn.PATH, description = "Identificador del vuelo generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("vueloId") String vueloId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody VueloDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VueloDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"auerolinea\": \"Volaris\",\n  \"origen\":\"Aeropuerto Internacional de la Ciudad de México\",\n  \"destino\": \"Aeropuerto Internacional de Cancún\",\n  \"fechaSalida\": \"01-05-2022\",\n  \"horaSalida\":\"22:00\",\n  \"fechaLlegada\": \"01-05-2022\",\n  \"horaLlegada\":\"22:00\",\n  \"asiento\": \"A-01\",\n  \"precio\": 2000.00,\n  \"tipoEquipaje\": \"Básico\"\n}\"", VueloDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VueloDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VueloDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> patchHotel(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody LugarDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> patchPlace(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody LugarDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> patchRestaurant(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody LugarDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ComentarioDTO> setComentarios(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ComentarioDTO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ComentarioDTO>(objectMapper.readValue("\"{\n  \"usuario\": \"Rodrigo\",\n  \"fecha\": \"20/10/2022\",\n  \"descripcion\":\"blablabla bla\"\n}\"", ComentarioDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ComentarioDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ComentarioDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VueloDto> setFly(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody VueloDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VueloDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"auerolinea\": \"Volaris\",\n  \"origen\":\"Aeropuerto Internacional de la Ciudad de México\",\n  \"destino\": \"Aeropuerto Internacional de Cancún\",\n  \"fechaSalida\": \"01-05-2022\",\n  \"horaSalida\":\"22:00\",\n  \"fechaLlegada\": \"01-05-2022\",\n  \"horaLlegada\":\"22:00\",\n  \"asiento\": \"A-01\",\n  \"precio\": 2000.00,\n  \"tipoEquipaje\": \"Básico\"\n}\"", VueloDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VueloDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VueloDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> setPlace(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody LugarDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VueloDto> updateFly(@Parameter(in = ParameterIn.PATH, description = "Identificador del vuelo generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("vueloId") String vueloId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody VueloDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VueloDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"auerolinea\": \"Volaris\",\n  \"origen\":\"Aeropuerto Internacional de la Ciudad de México\",\n  \"destino\": \"Aeropuerto Internacional de Cancún\",\n  \"fechaSalida\": \"01-05-2022\",\n  \"horaSalida\":\"22:00\",\n  \"fechaLlegada\": \"01-05-2022\",\n  \"horaLlegada\":\"22:00\",\n  \"asiento\": \"A-01\",\n  \"precio\": 2000.00,\n  \"tipoEquipaje\": \"Básico\"\n}\"", VueloDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VueloDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VueloDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> updateHotel(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody LugarDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> updatePlace(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody LugarDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> updateRestaurant(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody LugarDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> v1HotelLugarIdGet(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v1LugaresIdTipoGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v1LugaresPreciosGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LugarDto> v1ResuaturantLugarIdGet(@Parameter(in = ParameterIn.PATH, description = "Identificador del lugar generado durante la invocación a POST", required=true, schema=@Schema()) @PathVariable("lugarId") String lugarId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LugarDto>(objectMapper.readValue("\"{\n  \"id\": \"2134457654324\",\n  \"nombre\": \"Chichén Itzá\",\n  \"municipio\":\"Tinum\",\n  \"estado\": \"Yucatán\",\n  \"descripcion\":\"La ciudad es...\",\n  \"tipo\":\"Zona arqueológica\",\n  \"geolocalizacion\":{\n    \"latitud\": \"20.683032102156055\",\n    \"longitud\": \"-88.5685510258526\"\n  },\n  \"horarios\": [\n    \"Lunes a Viernes de 12:00 a 16:00\",\n    \"Sábado y Domingo de 09:00 a 18:00\"\n  ],\n  \"precios\":[\n    \"General $300 mxn\",\n    \"Estudiante $100 mxn\",\n    \"Adulto mayor $50 mxn\"\n  ]\n}\"", LugarDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LugarDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LugarDto>(HttpStatus.NOT_IMPLEMENTED);
    }

}

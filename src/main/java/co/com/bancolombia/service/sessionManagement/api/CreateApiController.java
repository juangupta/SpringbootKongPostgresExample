package co.com.bancolombia.service.sessionManagement.api;

import co.com.bancolombia.service.sessionManagement.model.JsonApiBodyRequest;
import co.com.bancolombia.service.sessionManagement.model.JsonApiBodyResponseErrors;
import co.com.bancolombia.service.sessionManagement.model.JsonApiBodyResponseSuccess;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-17T09:04:15.518-05:00")

@Controller
public class CreateApiController implements CreateApi {

    private static final Logger log = LoggerFactory.getLogger(CreateApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CreateApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<JsonApiBodyResponseSuccess> createPost(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyResponseSuccess>(objectMapper.readValue("{  \"data\" : [ {    \"header\" : {      \"id\" : \"id\",      \"type\" : \"type\"    },    \"expireIn\" : \"expireIn\",    \"accessToken\" : \"accessToken\",    \"refreshToken\" : \"refreshToken\"  }, {    \"header\" : {      \"id\" : \"id\",      \"type\" : \"type\"    },    \"expireIn\" : \"expireIn\",    \"accessToken\" : \"accessToken\",    \"refreshToken\" : \"refreshToken\"  } ]}", JsonApiBodyResponseSuccess.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyResponseSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyResponseSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

}

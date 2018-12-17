package co.com.bancolombia.service.sessionManagement.api;

import co.com.bancolombia.service.sessionManagement.model.ErrorDetail;
import co.com.bancolombia.service.sessionManagement.model.JsonApiBodyRequest;
import co.com.bancolombia.service.sessionManagement.model.JsonApiBodyResponseErrors;
import co.com.bancolombia.service.sessionManagement.model.JsonApiBodyResponseSuccess;
import co.com.bancolombia.service.sessionManagement.model.SessionManagementResponse;
import co.com.bancolombia.service.sessionManagement.model.jpa.OauthToken;
import co.com.bancolombia.service.sessionManagement.repository.OauthTokenRepository;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
import java.util.ArrayList;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-17T09:04:15.518-05:00")

@Controller
public class ValidateApiController implements ValidateApi {

    private static final Logger log = LoggerFactory.getLogger(ValidateApiController.class);

    @Value("${co.com.bancolombia.service.sessionmanagement.isConcurrentSessionsEnabled}")
    private boolean isConcurrentSessionsEnabled;
    
    @Value("${co.com.bancolombia.service.sessionmanagement.concurrentSessionsAction}")
    private String concurrentSessionsAction;
    
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    private OauthTokenRepository oauthTokenRepository;


    @org.springframework.beans.factory.annotation.Autowired
    public ValidateApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<?> validatePost(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequest body) {
    	if (!isConcurrentSessionsEnabled) {
    		List<OauthToken> Tokens = oauthTokenRepository.findByAuthenticatedUserid(body.getData().get(0).getUserId());
        	if (Tokens.size() > 0) {
        		ErrorDetail error = new ErrorDetail();
        		error.setCode("0001");
        		error.setDetail("El usuario ya tiene una sesión activa");
        		error.setId(body.getData().get(0).getHeader().getId());
        		error.setSource("/session/validate");
        		error.setStatus(HttpStatus.FAILED_DEPENDENCY.toString());
        		List<ErrorDetail> errors = new ArrayList<ErrorDetail>();
        		errors.add(error);
        		JsonApiBodyResponseErrors responseError = new JsonApiBodyResponseErrors();
        		responseError.setErrors(errors);
                return new ResponseEntity<JsonApiBodyResponseErrors>(responseError, HttpStatus.FAILED_DEPENDENCY);	
        	}
        	else{
        		SessionManagementResponse sessionManagementResponse = new SessionManagementResponse();
        		sessionManagementResponse.setHeader(body.getData().get(0).getHeader());
        		List<SessionManagementResponse> data = new ArrayList<SessionManagementResponse>();
        		data.add(sessionManagementResponse);
        		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
        		responseSuccess.setData(data);
                return new ResponseEntity<JsonApiBodyResponseSuccess>(responseSuccess, HttpStatus.OK);
        	}	
    	}   
    	
    	SessionManagementResponse sessionManagementResponse = new SessionManagementResponse();
		sessionManagementResponse.setHeader(body.getData().get(0).getHeader());
		List<SessionManagementResponse> data = new ArrayList<SessionManagementResponse>();
		data.add(sessionManagementResponse);
		JsonApiBodyResponseSuccess responseSuccess = new JsonApiBodyResponseSuccess();
		responseSuccess.setData(data);
        return new ResponseEntity<JsonApiBodyResponseSuccess>(responseSuccess, HttpStatus.OK);
    }

}

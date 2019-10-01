package es.sinvied.provinces.web;



import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.sinvied.provinces.domain.ProvinceListDTO;
import es.sinvied.provinces.service.ProvincesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Provinces controller
 *
 * @author Marino Vilchez
 */
@RestController
@Api(value = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Provinces.",
        produces = "application/json", consumes = "application/json")
public class ProvincesController {
	
	private final Logger logger = LogManager.getLogger(RestController.class.getName());

    @Autowired
    private ProvincesService provincesService;

    @ApiOperation(value = "Gets a list of Provinces. ", response = ProvinceListDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved provinces resource"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Internal Error")
    })
    
    @ResponseStatus(value=HttpStatus.OK)
    @GetMapping("/provinces")
    public ResponseEntity<ProvinceListDTO> provinces() {
    	//Realizar test unitarios
    	 logger.log(Level.INFO, "HttpStatus OK");
        return new ResponseEntity<ProvinceListDTO>(provincesService.getProvinces(), HttpStatus.OK);
    }
    
    
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> nullPointerHandler(){
        logger.log(Level.ERROR, "NullPointerException");
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @ResponseStatus(value=HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> numberFormatHandler(){
        logger.log(Level.ERROR, "FormatException");
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    
    @ResponseStatus(value=HttpStatus.GATEWAY_TIMEOUT)
    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<String> handleRunTimeException(RuntimeException e) {
    	logger.log(Level.ERROR, "TimeOut");
    	return new ResponseEntity<>(HttpStatus.GATEWAY_TIMEOUT);
    }
    
    
    
}

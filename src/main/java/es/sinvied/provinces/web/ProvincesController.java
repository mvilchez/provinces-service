package es.sinvied.provinces.web;

import es.sinvied.provinces.domain.ProvinceListDTO;
import es.sinvied.provinces.service.ProvincesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Provinces controller
 *
 * @author Marino Vilchez
 */
@RestController
@Api(value = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Provinces.",
        produces = "application/json", consumes = "application/json")
public class ProvincesController {

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
    @GetMapping("/provinces")
    public ResponseEntity<ProvinceListDTO> provinces() {
        return new ResponseEntity<ProvinceListDTO>(provincesService.getProvinces(), HttpStatus.OK);
    }
}

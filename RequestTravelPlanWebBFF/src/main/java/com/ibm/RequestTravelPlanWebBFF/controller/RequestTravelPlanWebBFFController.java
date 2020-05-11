package com.ibm.RequestTravelPlanWebBFF.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.RequestTravelPlanWebBFF.dto.UserRequestData;
import com.ibm.RequestTravelPlanWebBFF.service.RequestTravelPlanWebBFFService;

@CrossOrigin(origins="*")
@RestController
public class RequestTravelPlanWebBFFController {

	@Autowired
	RequestTravelPlanWebBFFService requestTravelPlanWebBFFService;

	@PostMapping(value="/requestTravel")
	public ResponseEntity<UserRequestData> travelRequest( @RequestBody UserRequestData userRequestData) {			
		
		 
        return ResponseEntity.ok().body(requestTravelPlanWebBFFService.travelRequest(userRequestData)); 
    }
}

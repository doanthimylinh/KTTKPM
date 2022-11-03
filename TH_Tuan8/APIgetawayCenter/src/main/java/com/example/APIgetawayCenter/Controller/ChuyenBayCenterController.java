package com.example.APIgetawayCenter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.APIgetawayCenter.entity.ChuyenBayCenter;
import com.example.APIgetawayCenter.model.ChuyenBay;
import com.example.APIgetawayCenter.responsitory.ChuyenBayResponsitory;

@RestController
@RequestMapping("/chuyenBayCenter")
public class ChuyenBayCenterController {
	
	@Autowired 
	private ChuyenBayResponsitory chuyenBayResponsitory;
	@PostMapping(path = "/create")
	public ResponseEntity<ChuyenBayCenter> createCB(@RequestBody ChuyenBayCenter chuyenBayCenter){
		ChuyenBayCenter chuyenBayCreate= chuyenBayResponsitory.save(chuyenBayCenter);
		return new ResponseEntity<>(chuyenBayCenter, HttpStatus.OK);
	}

}

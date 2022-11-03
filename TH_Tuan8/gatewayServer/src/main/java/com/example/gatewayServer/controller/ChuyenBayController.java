package com.example.gatewayServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gatewayServer.entity.ChuyenBay;
import com.example.gatewayServer.service.ChuyenBayService;

@RestController
@RequestMapping("/chuyenBay")
public class ChuyenBayController {
	
	@Autowired
	private ChuyenBayService chuyenBayService;
	
	
	@GetMapping("/test")
	public ResponseEntity<String> test(){
		return new  ResponseEntity<>("hello", HttpStatus.OK);
	}
	@GetMapping("/")
	public List<ChuyenBay> readchuyenBay() {
	    return chuyenBayService.getDsChuyenBay();
	}
	@DeleteMapping("/{maCb}")
	public void deleteChuyenBay(@PathVariable String maCb) {
	    chuyenBayService.deleteChuyenBay(maCb);
	    System.out.println("done");
	}

	@GetMapping("/{maCb}")
	ChuyenBay getById(@PathVariable String maCb) {
		return chuyenBayService.getChuyenBayById(maCb);
	}
	@PostMapping("/")
	ChuyenBay insert(@RequestBody ChuyenBay chuyenBay) {
		chuyenBayService.createChuyenBay(chuyenBay);
		return chuyenBay;
	}
}

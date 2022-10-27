package com.example.SpringBootAppRestTemplate.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.SpringBootAppRestTemplate.entity.ChuyenBay;

@RestController
public class ChuyenBayController {
	
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/chuyenBay/")
	public String getAllCB() {
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      
	      return restTemplate.exchange("http://localhost:8082/chuyenBay/", HttpMethod.GET, entity, String.class).getBody();
	}
	
	@RequestMapping(value = "/chuyenBay/", method = RequestMethod.POST)
	   public String createChuyenBays(@RequestBody ChuyenBay chuyenBay) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<ChuyenBay> entity = new HttpEntity<ChuyenBay>(chuyenBay,headers);
	      
	      return restTemplate.exchange(
	         "http://localhost:8082/ChuyenBay/", HttpMethod.POST, entity, String.class).getBody();
	   }
	@RequestMapping(value = "/chuyenBay/{maCb}", method = RequestMethod.DELETE)
	   public String deleteChuyenBay(@PathVariable("maCb") String maCb) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<ChuyenBay> entity = new HttpEntity<ChuyenBay>(headers);
	      
	      return restTemplate.exchange(
	    		  "http://localhost:8082/ChuyenBay/"+maCb, HttpMethod.DELETE, entity, String.class).getBody();
	   }


}
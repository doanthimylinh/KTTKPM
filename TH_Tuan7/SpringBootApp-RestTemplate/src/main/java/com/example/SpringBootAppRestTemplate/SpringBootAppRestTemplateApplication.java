package com.example.SpringBootAppRestTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.SpringBootAppRestTemplate.entity.ChuyenBay;

@SpringBootApplication
public class SpringBootAppRestTemplateApplication {

	static final String URL_CHUYENBAY = "http://localhost:8082/chuyenBay/";
	static final String URL_THEMCHUYENBAY = "http://localhost:8082/chuyenBay/";
	static final String URL_XOACHUYENBAY = "http://localhost:8082/chuyenBay/";

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		// get
		
//		String result = restTemplate.getForObject(URL_CHUYENBAY, String.class);
//		System.out.println(result);

		// post
//		{"maCB":"VN269","gaDi":"HAN","gaDen":"CXR","doDai":1262,"gioDi":"1970-01-01T06:10:00.000+00:00","gioDen":"1970-01-01T07:50:00.000+00:00","chiPhi":202}
//		ChuyenBay chuyenBay = new ChuyenBay("VN756","HAN","CXR", 262,null, null, 202);
//		
//		System.out.println(chuyenBay);
//		restTemplate.postForEntity(URL_THEMCHUYENBAY, chuyenBay, String.class);
//
//		// delete
//		String maCb = "VN900";
//		restTemplate.delete(URL_XOACHUYENBAY + maCb);

	}
}

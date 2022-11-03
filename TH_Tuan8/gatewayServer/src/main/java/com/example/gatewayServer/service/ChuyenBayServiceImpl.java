package com.example.gatewayServer.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gatewayServer.entity.ChuyenBay;
import com.example.gatewayServer.responsitory.ChuyenBayResponsitory;



@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {
	@Autowired 
	private ChuyenBayResponsitory chuyenBayRespository;

	@Override
	public List<ChuyenBay> getDsChuyenBay() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findAll();
	}

	@Override
	public ChuyenBay createChuyenBay(ChuyenBay chuyenbay) {
		// TODO Auto-generated method stub
		return chuyenBayRespository.save(chuyenbay);
	}

	@Override
	public void deleteChuyenBay(String maCb) {
		chuyenBayRespository.deleteById(maCb);
		
	}

	@Override
	public ChuyenBay getChuyenBayById(String maCb) {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findById(maCb).get();
	}





	
}

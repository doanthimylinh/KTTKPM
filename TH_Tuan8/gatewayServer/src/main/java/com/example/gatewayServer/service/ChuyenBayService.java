package com.example.gatewayServer.service;

import java.util.List;

import com.example.gatewayServer.entity.ChuyenBay;



public interface ChuyenBayService {
	
	List<ChuyenBay> getDsChuyenBay();
	ChuyenBay  createChuyenBay(ChuyenBay chuyenbay);
	void deleteChuyenBay(String maCb );
	ChuyenBay getChuyenBayById(String maCb);
}

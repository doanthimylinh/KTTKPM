package com.example.APIgetawayCenter.service;

import java.util.List;

import com.example.APIgetawayCenter.model.ChuyenBay;




public interface ChuyenBayService {
	
	List<ChuyenBay> getDsChuyenBay();
	ChuyenBay  createChuyenBay(ChuyenBay chuyenbay);
	void deleteChuyenBay(String maCb );
	ChuyenBay getChuyenBayById(String maCb);
}

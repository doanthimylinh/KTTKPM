package com.example.APIgetawayCenter.responsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.APIgetawayCenter.entity.ChuyenBayCenter;
import com.example.APIgetawayCenter.model.ChuyenBay;

@Repository
public interface ChuyenBayResponsitory extends JpaRepository<ChuyenBayCenter, String>{
	
}

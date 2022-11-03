package com.example.gatewayServer.responsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gatewayServer.entity.ChuyenBay;

@Repository
public interface ChuyenBayResponsitory extends JpaRepository<ChuyenBay, String>{
	
}

package com.example.APIgetawayCenter.model;

import java.util.List;

import com.example.APIgetawayCenter.entity.ChuyenBayCenter;

public class RequiredResponsitory {
	private ChuyenBayCenter chuyenBayCenter;
	private List<ChuyenBay> chuyenBays;
	public ChuyenBayCenter getChuyenBayCenter() {
		return chuyenBayCenter;
	}
	public void setChuyenBayCenter(ChuyenBayCenter chuyenBayCenter) {
		this.chuyenBayCenter = chuyenBayCenter;
	}
	public List<ChuyenBay> getChuyenBays() {
		return chuyenBays;
	}
	public void setChuyenBays(List<ChuyenBay> chuyenBays) {
		this.chuyenBays = chuyenBays;
	}
	public RequiredResponsitory(ChuyenBayCenter chuyenBayCenter, List<ChuyenBay> chuyenBays) {
		super();
		this.chuyenBayCenter = chuyenBayCenter;
		this.chuyenBays = chuyenBays;
	}
	public RequiredResponsitory() {
		super();
	}
	@Override
	public String toString() {
		return "RequiredResponsitory [chuyenBayCenter=" + chuyenBayCenter + ", chuyenBays=" + chuyenBays + "]";
	}
	

}

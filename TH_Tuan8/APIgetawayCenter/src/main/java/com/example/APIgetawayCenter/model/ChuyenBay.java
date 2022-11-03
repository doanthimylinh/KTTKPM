package com.example.APIgetawayCenter.model;
import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chuyenbay")
public class ChuyenBay implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "macb")
	private String maCB;
	
	@Column(name = "gadi")
	private String gaDi;
	
	@Column(name = "gaden")
	private String gaDen;
	
	@Column(name = "dodai")
	private int doDai;
	
	@Column(name = "giodi")
	private Date gioDi;
	
	@Column(name = "gioden")
	private Date gioDen;
	
	@Column(name = "chiphi")
	private int chiPhi;



	public String getMaCB() {
		return maCB;
	}


	public void setMaCB(String maCB) {
		this.maCB = maCB;
	}


	public String getGaDi() {
		return gaDi;
	}


	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}


	public String getGaDen() {
		return gaDen;
	}


	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}


	public int getDoDai() {
		return doDai;
	}


	public void setDoDai(int doDai) {
		this.doDai = doDai;
	}


	public Date getGioDi() {
		return gioDi;
	}


	public void setGioDi(Date gioDi) {
		this.gioDi = gioDi;
	}


	public Date getGioDen() {
		return gioDen;
	}


	public void setGioDen(Date gioDen) {
		this.gioDen = gioDen;
	}


	public ChuyenBay() {
		super();
	}


	public ChuyenBay(String maCB, String gaDi, String gaDen, int doDai, Date gioDi, Date gioDen, int chiPhi) {
		super();
		this.maCB = maCB;
		this.gaDi = gaDi;
		this.gaDen = gaDen;
		this.doDai = doDai;
		this.gioDi = gioDi;
		this.gioDen = gioDen;
		this.chiPhi = chiPhi;
	}


	public int getChiPhi() {
		return chiPhi;
	}


	public void setChiPhi(int chiPhi) {
		this.chiPhi = chiPhi;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "ChuyenBay [maCB=" + maCB + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", doDai=" + doDai + ", gioDi="
				+ gioDi + ", gioDen=" + gioDen + ", chiPhi=" + chiPhi + "]";
	}
	
	
	
}

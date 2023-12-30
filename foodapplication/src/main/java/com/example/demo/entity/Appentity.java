package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appentity {
	@Id
	private int hotelid;
	private String hotelname;
	private String hoteltype;
	private String location;
	private String openingtime;
	private String closingtime;
	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getHoteltype() {
		return hoteltype;
	}
	public void setHoteltype(String hoteltype) {
		this.hoteltype = hoteltype;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOpeningtime() {
		return openingtime;
	}
	public void setOpeningtime(String openingtime) {
		this.openingtime = openingtime;
	}
	public String getClosingtime() {
		return closingtime;
	}
	public void setClosingtime(String closingtime) {
		this.closingtime = closingtime;
	}
	public Appentity(int hotelid, String hotelname, String hoteltype, String location, String openingtime,
			String closingtime) {
		super();
		this.hotelid = hotelid;
		this.hotelname = hotelname;
		this.hoteltype = hoteltype;
		this.location = location;
		this.openingtime = openingtime;
		this.closingtime = closingtime;
	}
	public Appentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

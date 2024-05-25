package com.example.FinalProject1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class House {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String hname;
	private String category;
	private String bedroom;
	private String email;
	private String city;
	private String mobile;
	private String address;
	private String description;
	private Double price;
	private Double lat;
	private Double lng;
	
	
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBedroom() {
		return bedroom;
	}
	public void setBedroom(String bedroom) {
		this.bedroom = bedroom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public House(int id, String hname, String category, String bedroom, String email, String city, String mobile,
			String address, String description, Double price,Double lat,Double lng) {
		super();
		this.id = id;
		this.hname = hname;
		this.category = category;
		this.bedroom = bedroom;
		this.email = email;
		this.city = city;
		this.mobile = mobile;
		this.address = address;
		this.description = description;
		this.price = price;
		this.lat=lat;
		this.lng=lng;
	}
	@Override
	public String toString() {
		return "House [id=" + id + ", hname=" + hname + ", category=" + category + ", bedroom=" + bedroom + ", email="
				+ email + ", city=" + city + ", mobile=" + mobile + ", address=" + address + ", description="
				+ description + ", price=" + price + ",lat="+lat+",lng="+lng+"]";
	}
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

package com.geoExample.test.Entity;

public class GeoIp {
	
	private String ipAddress;
	private String city;
	private String latittude;
	private String longitude;
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLatittude() {
		return latittude;
	}
	public void setLatittude(String latittude) {
		this.latittude = latittude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public GeoIp(String ipAddress, String city, String latittude,
			String longitude) {
		super();
		this.ipAddress = ipAddress;
		this.city = city;
		this.latittude = latittude;
		this.longitude = longitude;
	}

}

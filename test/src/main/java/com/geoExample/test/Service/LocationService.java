package com.geoExample.test.Service;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

import com.geoExample.test.Entity.GeoIp;
import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;

public class LocationService {

 private DatabaseReader dbReader;
 
 public LocationService()throws IOException {
	 File data = new File("you-mmdb-location");
	 dbReader = new DatabaseReader.Builder(data).build();
 }
 public GeoIp getLocation(String Ip) throws IOException, GeoIp2Exception{
	
	 InetAddress ipAddress = InetAddress.getByName(Ip);
	 CityResponse response = dbReader.city(ipAddress);
	 
	 String cityName = response.getCity().getName();
	 String latitude = response.getLocation().getLatitude().toString();
	 String longitude = response.getLocation().getLongitude().toString();
	 
	 return new GeoIp(Ip,cityName, latitude, longitude);
	 
 }
}

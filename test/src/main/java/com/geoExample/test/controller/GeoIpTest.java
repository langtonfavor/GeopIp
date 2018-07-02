package com.geoExample.test.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.geoExample.test.Entity.GeoIp;
import com.geoExample.test.Service.LocationService;

@RestController
public class GeoIpTest {
 private LocationService locationService;
 
 public GeoIpTest() throws IOException{
	 
	 locationService = new LocationService();
	 
 }
 @PostMapping("/GeoIpTest")
 public GeoIp getLocation(@RequestParam(value="ipAddress", required=true) String ipAddress) throws Exception {
	
	 LocationService locationService 
     = new LocationService();
   return locationService.getLocation(ipAddress);
}
}

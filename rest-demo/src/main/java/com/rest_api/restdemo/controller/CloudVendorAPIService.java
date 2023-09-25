package com.rest_api.restdemo.controller;

import com.rest_api.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/cloudvendor")

public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
//        return  new CloudVendor("C1","CVS 1",
//                "USA", "xxxxx" );
        return cloudVendor;
    }
@PostMapping
    public String createCloudvendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "cloud vendor created successfully";
    }
    @PutMapping
    public String updateCloudvendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "cloud vendor Updated successfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudvendorDetails(String vendorId){
        this.cloudVendor=null;
        return "cloud vendor Deleted successfully";
    }
}

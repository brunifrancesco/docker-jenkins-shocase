package com.dunno.controllers;

import com.dunno.restmodels.AirBNBRestModelResponse;
import com.dunno.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

@RestController
public class HelloController {

    @Autowired
    private RequestService templateService;


    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/search")
    public ResponseEntity<AirBNBRestModelResponse> search(@RequestParam(value = "query", required = true) String query){
        try{
            return new ResponseEntity<>(templateService.doRequest(query, "https://api.airbnb.com/v2/search_results?client_id=3092nxybyb0otqw18e8nh5nty&locale=en-US&currency=EUR&_format=for_search_results_with_minimal_pricing&_limit=10&_offset=0&fetch_facets=true&guests=1&ib=false&ib_add_photo_flow=true&location="+query+"&min_bathrooms=0&min_bedrooms=0&min_beds=1&min_num_pic_urls=10&price_max=210&price_min=40&sort=1"), HttpStatus.OK);
        }catch (HttpClientErrorException hce){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch (HttpServerErrorException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}
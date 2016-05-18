package com.dunno.services;

import com.dunno.restmodels.AirBNBRestModelResponse;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * Created by bruni on 18/05/16.
 */
@Service("RequestService")
public class RequestServiceImpl implements RequestService {

    @Override
    public AirBNBRestModelResponse doRequest(String address, String url) throws HttpClientErrorException, HttpServerErrorException {
        RestTemplate r = new RestTemplate();
        r.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        return r.getForObject(url, AirBNBRestModelResponse.class);
    }
}

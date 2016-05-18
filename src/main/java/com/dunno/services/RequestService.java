package com.dunno.services;

import com.dunno.restmodels.AirBNBRestModelResponse;

/**
 * Created by bruni on 18/05/16.
 */
public interface RequestService {

    AirBNBRestModelResponse doRequest(String address, String url);
}

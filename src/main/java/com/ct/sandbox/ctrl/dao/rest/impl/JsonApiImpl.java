package com.ct.sandbox.ctrl.dao.rest.impl;

import com.ct.sandbox.ctrl.dao.rest.JsonApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class JsonApiImpl  implements JsonApi {

    private static final Logger LOG = LoggerFactory.getLogger(JsonApiImpl.class);

    private static final String BASEURL = "https://dummyjson.com/";

    @Override
    public void getApiTestStatus() {

        String url = BASEURL + "test";

        RestClient restClient = RestClient.create();

        String result = restClient.get()
                .uri(url)
                .retrieve()
                .body(String.class);

        LOG.info(result);
    }

    @Override
    public void getApiUsers() {

        String url = BASEURL + "users";

        RestClient restClient = RestClient.create();

        String result = restClient.get()
                .uri(url)
                .retrieve()
                .body(String.class);

        LOG.info(result);
    }
}

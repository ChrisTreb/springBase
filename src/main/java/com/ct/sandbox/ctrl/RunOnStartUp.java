package com.ct.sandbox.ctrl;

import com.ct.sandbox.ctrl.dao.Calculator;
import com.ct.sandbox.ctrl.dao.impl.CalculatorImpl;
import com.ct.sandbox.ctrl.dao.rest.JsonApi;
import com.ct.sandbox.ctrl.dao.rest.impl.JsonApiImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class RunOnStartUp implements ApplicationListener<ApplicationReadyEvent> {

    private static final Logger LOG = LoggerFactory.getLogger(RunOnStartUp.class);

    private final Calculator calculator = new CalculatorImpl() {};

    private final JsonApi jsonApi = new JsonApiImpl();

    public RunOnStartUp() {
        // Constructor
    }

    @Override
    public void onApplicationEvent(@NonNull ApplicationReadyEvent event) {

        LOG.info("Startup success !");

        double result = calculator.divise(8, 12);
        LOG.info("8 + 12 = {}", result);

        jsonApi.getApiTestStatus();
        jsonApi.getApiUsers();
    }
}

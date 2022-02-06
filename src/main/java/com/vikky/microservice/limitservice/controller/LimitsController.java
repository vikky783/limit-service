package com.vikky.microservice.limitservice.controller;

import com.vikky.microservice.limitservice.configuration.Configuration;
import com.vikky.microservice.limitservice.domain.Limits;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    Logger logger = LogManager.getLogger(LimitsController.class);
    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());

//        logger.debug("Got a Request from the UI");
//        return new Limits(1,17);

    }
}

package provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String hello(){
        return "hello provider server";
    }

    @GetMapping("/test")
    public void test(){

        logger.debug("logger debug");

        logger.info("logger info");


        logger.error("logger error");

        logger.warn("logger warning");
    }
}

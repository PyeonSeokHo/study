package com.testPrj;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@RestController
public class TestController {

    private static final Logger logger = LogManager.getLogger(TestController.class);

    @GetMapping(value = "/log")
    public void function() {
        logger.info("INFO SUCCESS");
        logger.debug("DEBUG SUCCESS");
        logger.error("ERROR SUCCESS");
    }
}

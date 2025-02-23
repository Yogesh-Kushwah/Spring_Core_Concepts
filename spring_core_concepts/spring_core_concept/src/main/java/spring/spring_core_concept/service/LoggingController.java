package spring.spring_core_concept.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.spring_core_concept.beans.EmployeeBean;

@RestController
@RequestMapping("/search")
public class LoggingController {

    //UC 02
    //Add Logger to Log Messages Use Built In SLF4J – Simple Logging Framework
    // Create SLF4J Logger
    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

    // Log message endpoint
    @GetMapping("/log")
    public String logExample(@RequestParam(value = "name", defaultValue = "User") String name) {
        logger.info("Log request received for name: {}", name);
        return "Hello, " + name + "! Check logs for details.";
    }

}

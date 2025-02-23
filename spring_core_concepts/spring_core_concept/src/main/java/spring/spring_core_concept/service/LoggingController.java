package spring.spring_core_concept.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.spring_core_concept.beans.EmployeeBean;

@RestController
@RequestMapping("/search")
public class LoggingController {

    //UC01

    @GetMapping("/hello")
    @ResponseBody
    public String sayHelloUsingVSCode() {
        return "Hello from BridgeLabz Using VSCode";
    }



    //UC 02
    // Create SLF4J Logger
    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

    // Log message endpoint
    @GetMapping("/log")
    public String logExample(@RequestParam(value = "name", defaultValue = "User") String name) {
        logger.info("Log request received for name: {}", name);
        return "Hello, " + name + "! Check logs for details.";
    }




    //UC03

    private final EmployeeBean employee;

    @Autowired
    public LoggingController(EmployeeBean employee) {
        this.employee = employee;
    }

    // Fetch employee details
    @GetMapping("/details")
    public String getEmployeeDetails() {
        logger.info("Fetching employee details.");
        return "Employee Name: " + employee.getEmployeeName() + ", Department: " + employee.getDepartmentName();
    }
}

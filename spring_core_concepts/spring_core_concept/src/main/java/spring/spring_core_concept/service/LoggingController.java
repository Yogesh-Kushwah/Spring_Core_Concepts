package spring.spring_core_concept.service;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/search")
public class LoggingController {

    //UC01

    @GetMapping("/hello")
    @ResponseBody
    public String sayHelloUsingVSCode() {
        return "Hello from BridgeLabz Using VSCode";
    }


}

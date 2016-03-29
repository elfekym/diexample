package guru.springframework.controller;

import guru.springframework.Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;

/**
 * Created by reve99 on 3/29/2016.
 */
@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;
    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello(){
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        return greeting;
    }
}

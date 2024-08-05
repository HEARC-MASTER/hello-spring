package ch.hearc.jee2024.hellospring;


import ch.hearc.jee2024.hellospring.ioc.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    @GetMapping(value = "/hello")
    public @ResponseBody String helloWorld() {
        return "Hello World!";
    }




}

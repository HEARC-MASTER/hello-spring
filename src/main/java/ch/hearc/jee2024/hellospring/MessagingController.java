package ch.hearc.jee2024.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("send")
public class MessagingController {

    @GetMapping
    public String send(){
        //ici appell du service d'envoi
        return "Message send";
    }
}

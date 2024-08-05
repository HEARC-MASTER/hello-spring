package ch.hearc.jee2024.hellospring;

import ch.hearc.jee2024.hellospring.ioc.EmailService;
import ch.hearc.jee2024.hellospring.ioc.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/send")
public class MessagingController {

    private static final Logger LOGGER = Logger.getLogger(MessagingController.class.getName());


    private MessagingService messagingService;

    public MessagingController(MessagingService messagingService){
        this.messagingService = messagingService;
    }


    @GetMapping()
    public String send(){
        //ici appell du service d'envoi
        String mailResult = messagingService.send("test","test@test.ch");
        LOGGER.info(mailResult);
        return mailResult;
    }
}

package ch.hearc.jee2024.hellospring;

import ch.hearc.jee2024.hellospring.ioc.EmailService;
import ch.hearc.jee2024.hellospring.ioc.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/send")
public class MessagingController {

    private static final Logger LOGGER = Logger.getLogger(MessagingController.class.getName());

    private MessagingService mailService;
    private MessagingService smsService;

    public MessagingController(@Qualifier("mailService")MessagingService mailService,@Qualifier("smsService")MessagingService smsService ){
        this.mailService = mailService;
        this.smsService = smsService;
    }

    @GetMapping("/{type}")
    public String send(@PathVariable(required = true) String type) {
        switch (type) {
            case "sms":
                String smsResult = smsService.send("test", "test@test.ch");
                LOGGER.info(smsResult);
                return smsResult;


            case "mail":
                String mailResult = mailService.send("test", "test@test.ch");
                LOGGER.info(mailResult);
                return mailResult;


            default:
                throw new RuntimeException("Path variable parameter not allowed");
        }
    }

    /*
    @GetMapping("/mail")
    public String sendMail(){
        //ici appell du service d'envoi
        String mailResult = mailService.send("test","test@test.ch");
        LOGGER.info(mailResult);
        return mailResult;
    }

    @GetMapping("/sms")
    public String sendSms(){
        //ici appell du service d'envoi
        String mailResult = smsService.send("test","test@test.ch");
        LOGGER.info(mailResult);
        return mailResult;
    }
*/


    @GetMapping("/header")
    public String sendByHeader(
            @RequestHeader(value = "type", required = true) String type) {

        switch (type) {
            case "sms":
                String smsResult = smsService.send("test", "test@test.ch");
                LOGGER.info(smsResult);
                return smsResult;


            case "mail":
                String mailResult = mailService.send("test", "test@test.ch");
                LOGGER.info(mailResult);
                return mailResult;


            default:
                throw new RuntimeException("Parameter not allowed");
        }
    }
    @GetMapping()
    public String sendByType(@RequestParam(required = true) String type ){

        switch (type){
            case "sms":
                String smsResult = smsService.send("test","test@test.ch");
                LOGGER.info(smsResult);
                return smsResult;


            case "mail":
                String mailResult = mailService.send("test","test@test.ch");
                LOGGER.info(mailResult);
                return mailResult;


            default:throw new RuntimeException("Request Parameter not allowed");
        }



    }

}

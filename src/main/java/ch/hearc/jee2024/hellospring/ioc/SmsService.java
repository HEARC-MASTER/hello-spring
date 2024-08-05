package ch.hearc.jee2024.hellospring.ioc;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

//@Component
public class SmsService implements MessagingService{

    private static final Logger LOGGER = Logger.getLogger(SmsService.class.getName());

    @Override
    public String send(String message, String destinataire) {
        LOGGER.info(String.format("SMS: [%s] send to %s",message,destinataire));
        return "SMS message successfully send!";
    }
}

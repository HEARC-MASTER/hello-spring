package ch.hearc.jee2024.hellospring.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Qualifier("mailService")
public class EmailService implements MessagingService{

    private static final Logger LOGGER = Logger.getLogger(EmailService.class.getName());
    @Override
    public String send(String message, String destinataire) {
        LOGGER.info(String.format("Mail: [%s] send to %s",message,destinataire));
        return "Mail message successfully send!";
    }
}

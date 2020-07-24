package kg.web_scm.component;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @JmsListener(destination = "my.queue")
    public void consume(String message) {
        System.out.println("Message received" + message);
    }
}
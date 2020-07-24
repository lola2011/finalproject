package kg.web_scm.controller;

import kg.web_scm.entity.Inventory;
import kg.web_scm.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
@RequestMapping("/rest/publish")
public class ProducerResources {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private Queue queue;


    @GetMapping("/{message}")
    public String publish(@PathVariable final String message) {
        //  if(inventory.getProductQuantity()<100){
        jmsTemplate.convertAndSend(queue, message);

        return "Successfully published";
    }
}

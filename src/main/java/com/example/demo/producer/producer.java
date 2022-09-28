package com.example.demo.producer;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.DBSJMSConfig;
import com.example.demo.dto.*;
@RestController
public class producer {



	   
    @Autowired
    private RabbitTemplate template;
    
     @PostMapping("/order/{abc}")
     public String bookOrder(@RequestBody order o, @PathVariable String abc) {
            o.setOrderid(UUID.randomUUID().toString());
            
             orderstatus os= new orderstatus(o, "PROCESS", "order placed succesfully in " + abc);
            
            template.convertAndSend(DBSJMSConfig.EXCHANGE, DBSJMSConfig.ROUTING_KEY, os);
            
            return "Success !!";
        }
 
     
     @PostMapping("/paper/{abc}")
     public String paper(@RequestBody order o, @PathVariable String abc) {
            o.setOrderid(UUID.randomUUID().toString());
            
             orderstatus os= new orderstatus(o, "PROCESS", "order placed succesfully in " + abc);
            
            template.convertAndSend(DBSJMSConfig.EXCHANGE, DBSJMSConfig.ROUTING_KEY, os);
            
            return "Success !!";
        }
 
}

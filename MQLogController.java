package com.example.logging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.logging.bean.LogEntry;

@RestController
@RequestMapping("/logs")
public class MQLogController {
	@Autowired
    private JmsTemplate jmsTemplate;
    
    @PostMapping("/mq")
    public ResponseEntity<String> sendLogEntryToMQ(@RequestBody LogEntry logEntry) {
        try {
            jmsTemplate.convertAndSend("logging", logEntry);
            return ResponseEntity.status(HttpStatus.OK).body("Log entry received and sent to MQ topic.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unable to process log entry.");
        }
    }



}

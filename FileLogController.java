package com.example.logging.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.logging.bean.LogEntry;

@RestController
@RequestMapping("/logs")
public class FileLogController {

	@PostMapping("/file")
    public ResponseEntity<String> writeLogEntryToFile(@RequestBody LogEntry logEntry) {
        try {
            FileWriter fileWriter = new FileWriter("logs.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(logEntry.toString());
            printWriter.close();
            return ResponseEntity.status(HttpStatus.OK).body("Log entry received and written to file.");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unable to process log entry.");
        }
    }

}

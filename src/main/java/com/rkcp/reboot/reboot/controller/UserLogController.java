package com.rkcp.reboot.reboot.controller;

import com.rkcp.reboot.reboot.model.UserLog;
import com.rkcp.reboot.reboot.model.UserLogEntry;
import com.rkcp.reboot.reboot.repository.UserLogRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user-logs")
public class UserLogController {

    private static Logger logger = LoggerFactory.getLogger(UserLogController.class);

    @Autowired
    private UserLogRepository userLogRepository;

    @GetMapping
    public ResponseEntity<List<UserLog>> getUserLogs() {
        List<UserLog> userLogs = userLogRepository.findAll();
        return ResponseEntity.status(200).body(userLogs);
    }

    @PostMapping
    public ResponseEntity<UserLog> submitUserLog(@RequestBody UserLogEntry userLogEntry) {

        UserLog userLog = new UserLog(
                UUID.randomUUID(),
                userLogEntry.logType(),
                userLogEntry.userReflection(),
                LocalDateTime.now()
        );

        try {
            userLog = userLogRepository.save(userLog);
        } catch (IllegalArgumentException e) {
            logger.error("Unable to save to cassandra db: {}", e.getMessage());
        }

        return ResponseEntity.status(201).body(userLog);
    }
}

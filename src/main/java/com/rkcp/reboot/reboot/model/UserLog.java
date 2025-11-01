package com.rkcp.reboot.reboot.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Stores the log the user inputs when they come into the webapp and are doing their tracking for the day
 */
@Table("user_logs")
public class UserLog {

    @PrimaryKey
    private UUID logId;

    private LogType logType;
    private UserReflection reflection;
    private LocalDateTime dateCreated;
}

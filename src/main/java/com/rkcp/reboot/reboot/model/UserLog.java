package com.rkcp.reboot.reboot.model;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Stores the log the user inputs when they come into the webapp and are doing their tracking for the day
 */
@Table("user_logs")
public record UserLog(

        @PrimaryKeyColumn(
                name = "userid",
                ordinal = 0,
                type = PrimaryKeyType.PARTITIONED
        )
        Integer userId,

        @PrimaryKeyColumn(
                name = "weekbucket",
                ordinal = 1,
                type = PrimaryKeyType.PARTITIONED
        )
        String week,

        UUID logID,
        LogType logType,
        String userReflection,

        @PrimaryKeyColumn(
                name = "datecreated",
                ordinal = 2,
                type = PrimaryKeyType.CLUSTERED
        )
        LocalDateTime dateCreated
) {}

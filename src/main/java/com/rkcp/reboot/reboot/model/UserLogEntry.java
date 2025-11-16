package com.rkcp.reboot.reboot.model;

public record UserLogEntry(
        LogType logType,
        UserReflection userReflection) { // UserReflection might grow from just being a string to a full object...
}

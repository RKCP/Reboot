package com.rkcp.reboot.reboot.model;

public record UserLogEntry(
        Integer userId, // ideally the wrapping App would automatically send this, but for now we will manually do so in postman.
        LogType logType,
        UserReflection userReflection) { // UserReflection might grow from just being a string to a full object...
}

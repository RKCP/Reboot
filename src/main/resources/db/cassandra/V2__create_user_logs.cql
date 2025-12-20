CREATE TABLE reboot_app.user_logs (
    userId int,
    weekBucket text,
    logid uuid,
    datecreated timestamp,
    logtype text,
    userreflection text,
    PRIMARY KEY ((userId, weekBucket))
);
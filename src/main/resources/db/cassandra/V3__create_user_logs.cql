CREATE TABLE reboot_app.user_logs (
    userid int,
    weekbucket text,
    logid uuid,
    datecreated timestamp,
    logtype text,
    userreflection text,
    PRIMARY KEY ((userId, weekBucket), datecreated)
);
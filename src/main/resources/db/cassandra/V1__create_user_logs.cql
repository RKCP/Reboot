CREATE TABLE reboot_app.user_logs (
    logid uuid PRIMARY KEY,
    datecreated timestamp,
    logtype text,
    userreflection text
);
ALTER TABLE reboot_app.user_logs
WITH default_time_to_live = 86400;


# in newest versions of Spring Data Cassandra, you cannot insert TTL per row via the .save() method unless you use
# a CassandraTempalte to insert it... Only other way, is to have all entries share the TTL, by Altering the table
# for future inserts, or drop/create the table with set TTL.
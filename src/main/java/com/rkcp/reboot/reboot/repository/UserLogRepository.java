package com.rkcp.reboot.reboot.repository;

import com.rkcp.reboot.reboot.model.UserLog;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserLogRepository extends CassandraRepository<UserLog, UUID> {
    //
}

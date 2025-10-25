package com.rkcp.reboot.reboot.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLogRepository extends CassandraRepository {
}

//package com.rkcp.reboot.reboot.util;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.dao.DataAccessException;
//import org.springframework.data.cassandra.core.cql.CqlTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CassandraStartupHealthCheck implements ApplicationRunner { // ApplicationRunner is a Spring Boot interface that runs after the application context starts (but before app really begins “serving”)
//
//    private final CqlTemplate cqlTemplate;
//    private static Logger logger = LoggerFactory.getLogger(CassandraStartupHealthCheck.class);
//
//    public CassandraStartupHealthCheck(CqlTemplate cqlTemplate) {
//        this.cqlTemplate = cqlTemplate;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) {
//        try {
//            cqlTemplate.queryForObject("SELECT now() FROM system.local", Object.class); // using queryForObject since it retrieves a single value (.now() returns one row)
//            logger.info("Connection to Cassandra successful on startup");
//        } catch (DataAccessException e) {
//            logger.error("✅ Cassandra not reachable on startup, tried reaching with test query: {}", e.getMessage());
//            logger.error("❌ Please fix connection with Cassandra, closing application now");
//            System.exit(1);
//        }
//    }
//
//}

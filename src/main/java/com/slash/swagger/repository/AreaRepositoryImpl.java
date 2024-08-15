package com.slash.swagger.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AreaRepositoryImpl implements AreaRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String loadArea(int id) {
        return jdbcTemplate.queryForObject("SELECT Name FROM Area WHERE ID = " + id, String.class);
    }
}

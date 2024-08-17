package com.slash.swagger.repository;

import com.slash.swagger.domain.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AreaRepositoryImpl implements AreaRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String loadAreaName(int id) {
        return jdbcTemplate.queryForObject("SELECT Name FROM Area WHERE AreaID = " + id, String.class);
    }

    @Override
    public Area loadArea(int id) {
        return jdbcTemplate.queryForObject("SELECT AreaID, Name, Size, CreatedAt FROM Area WHERE AreaID = " + id, new BeanPropertyRowMapper<>(Area.class));
    }
}

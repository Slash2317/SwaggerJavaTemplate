package com.slash.swagger.repository;

import com.slash.swagger.domain.Area;

public interface AreaRepository {

    String loadAreaName(int id);

    Area loadArea(int id);
}

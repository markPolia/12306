package com.github.markPolia.action.dao;

import com.github.markPolia.action.domain.Station;
import java.util.List;

public interface StationMapper {
    int deleteByPrimaryKey(String stationName);

    int insert(Station row);

    Station selectByPrimaryKey(String stationName);

    List<Station> selectAll();

    int updateByPrimaryKey(Station row);
}
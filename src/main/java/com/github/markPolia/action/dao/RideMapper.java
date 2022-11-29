package com.github.markPolia.action.dao;

import com.github.markPolia.action.domain.Ride;
import java.util.List;

public interface RideMapper {
    int deleteByPrimaryKey(String rideId);

    int insert(Ride row);

    Ride selectByPrimaryKey(String rideId);

    List<Ride> selectAll();

    int updateByPrimaryKey(Ride row);
}
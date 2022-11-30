package com.github.markPolia.action.dao;

import com.github.markPolia.action.domain.Passby;
import com.github.markPolia.action.domain.Ride;

import java.util.List;

public interface PassbyMapper {
    List<Passby> selectByLocations(Ride ride);
}
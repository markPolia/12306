package com.github.markPolia.action.dao;

import com.github.markPolia.action.domain.Passby;
import java.util.List;

public interface PassbyMapper {
    int deleteByPrimaryKey(String passbyId);

    int insert(Passby row);

    Passby selectByPrimaryKey(String passbyId);

    List<Passby> selectAll();

    int updateByPrimaryKey(Passby row);
}
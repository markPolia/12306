package com.github.markPolia.action.dao;

import com.github.markPolia.action.domain.Train;
import java.util.List;

public interface TrainMapper {
    int deleteByPrimaryKey(String trainNo);

    int insert(Train row);

    Train selectByPrimaryKey(String trainNo);

    List<Train> selectAll();

    int updateByPrimaryKey(Train row);
}
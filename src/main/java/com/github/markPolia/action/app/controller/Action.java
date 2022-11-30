package com.github.markPolia.action.app.controller;

import com.github.markPolia.action.domain.Passby;
import com.github.markPolia.action.domain.Ride;

import java.util.List;

public interface Action {
    /**
     *  检索相关车程信息
     * @return 相关车程次信息
     */
    List<Passby> doSearchTrainList(Ride ride);
}

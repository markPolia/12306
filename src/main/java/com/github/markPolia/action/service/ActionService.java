package com.github.markPolia.action.service;

import com.github.markPolia.action.domain.Passby;
import com.github.markPolia.action.domain.Ride;

import java.util.List;

public interface ActionService {
    /**
     *  查询车票信息
     * @param ride 出发城市、到达城市
     * @return 车票表
     */
    List<Passby> searchTicketInfo(Ride ride);
}

package com.github.markPolia.action.app.controller.impl;

import com.github.markPolia.action.app.controller.Action;
import com.github.markPolia.action.domain.Passby;
import com.github.markPolia.action.domain.Ride;
import com.github.markPolia.action.service.ActionService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("action")
public class ActionImpl implements Action {
    /**
     *  服务
     */
    @Resource
    private ActionService actionService;

    @Override
    public List<Passby> doSearchTrainList(Ride ride) {
        return actionService.searchTicketInfo(ride);
    }
}

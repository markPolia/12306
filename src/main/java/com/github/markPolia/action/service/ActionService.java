package com.github.markPolia.action.service;

import com.github.markPolia.action.domain.Passby;
import com.github.markPolia.action.domain.Ride;

import java.util.List;

public interface ActionService {
    List<Passby> searchTicketInfo(Ride ride);
}

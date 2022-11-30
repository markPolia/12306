package com.github.markPolia.action.service.impl;

import com.github.markPolia.action.dao.PassbyMapper;
import com.github.markPolia.action.dao.RideMapper;
import com.github.markPolia.action.dao.StationMapper;
import com.github.markPolia.action.dao.TrainMapper;
import com.github.markPolia.action.domain.Passby;
import com.github.markPolia.action.domain.Ride;
import com.github.markPolia.action.service.ActionService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

@Service("actionService")
public class ActionServiceImpl implements ActionService {
    @Resource
    private PassbyMapper passbyMapper;
    @Resource
    private RideMapper rideMapper;
    @Resource
    private StationMapper stationMapper;
    @Resource
    private TrainMapper trainMapper;

    @Override
    public List<Passby> searchTicketInfo(Ride ride) {
        // select * from t_passBy where station_name = #{beginStation} or station_name = ${endStation}
        // 起 -> 终
        // 起 -> 经
        // 经 -> 终
        // 经 -> 经
        List<Passby> passbyList = passbyMapper.selectByLocations(ride);
        Map<String, Passby> map = new HashMap<>(8);
        // 车次号相等
        for (Passby p : passbyList) {
            Passby passby;
            if ((passby = map.get(p.getTrainNo())) == null) {
                map.put(p.getTrainNo(), p);
            } else {
                if (passby.getStationName().equals(ride.getBeginStation()) /* 起始地点一致 */) {

                }
            }
        }
        System.out.println(passbyList);
        return null;
    }
}

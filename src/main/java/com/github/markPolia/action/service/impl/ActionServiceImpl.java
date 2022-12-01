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

import java.util.ArrayList;
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

    /**
     *   <pre>
     *
     *    1、起 -> 终   G1342   长沙 -> 上海
     *    2、起 -> 经   G2125   长沙 -> 贵阳
     *    3、经 -> 终   G1348   长沙 -> 上海
     *    4、经 -> 经   G1378   长沙 -> 上海
     *
     *        出发地的全部站台
     *       select begin_station_names(station_name) from t_station where city = #{beginCity}
     *        目的地的全部站台
     *        select end_station_names(station_name) from t_station where city = #{endCity}
     *
     *        [起点、经过] select train_nos(train_no) from t_passBy where station_name in (begin_station_names);
     *        [终点、经过] select train_nos(train_no) from t_passBy where train_no in (train_nos) and station_name in (end_station_names);
     *
     *                 =>  子查询
     *                 select train_no from t_passBy where train_no in (
     *                     select
     *                             train_no
     *                     from
     *                             t_passBy
     *                     where
     *                             station_name in (select station_name from t_station where city = "上海")
     *                     )
     *                 and station_name in (
     *                     select
     *                             station_name
     *                     from
     *                             t_station
     *                     where
     *                             city = "长沙"
     *                     );
     *
     *                 =>  连接查询
     *                 select
     *                     p.train_no, s.station_name 'begin_station', t.station_name 'end_station'
     *                 from
     *                     t_station s
     *                 join
     *                     t_passby p
     *                 on
     *                     p.station_name = s.station_name
     *                 join
     *                         (select
     *                             p.train_no, s.station_name, p.station_order
     *                         from
     *                             t_station s
     *                         join
     *                             t_passby p
     *                         on
     *                             p.station_name = s.station_name
     *                         where # 目的地
     *                             s.city = "郑州") t
     *                 on
     *                     p.train_no = t.train_no
     *                 where
     *                     # 出发地
     *                     s.city = "成都"
     *                 # 比较两张表的站点顺序
     *                 and
     *                     p.station_order < t.station_order    </pre>
     *
     */
    @Override
    public List<Passby> searchTicketInfo(Ride ride) {
        return null;
    }
}

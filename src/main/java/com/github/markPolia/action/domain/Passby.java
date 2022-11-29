package com.github.markPolia.action.domain;

import java.util.Date;

public class Passby {
    private String passbyId;

    private String trainNo;

    private String stationName;

    private Date approach;

    private Date departure;

    private Byte stationOrder;

    public String getPassbyId() {
        return passbyId;
    }

    public void setPassbyId(String passbyId) {
        this.passbyId = passbyId == null ? null : passbyId.trim();
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo == null ? null : trainNo.trim();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public Date getApproach() {
        return approach;
    }

    public void setApproach(Date approach) {
        this.approach = approach;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Byte getStationOrder() {
        return stationOrder;
    }

    public void setStationOrder(Byte stationOrder) {
        this.stationOrder = stationOrder;
    }
}
package com.github.markPolia.action.domain;

import java.math.BigDecimal;

public class Ride {
    private String rideId;

    private String uid;

    private String trainNo;

    private BigDecimal price;

    private String beginStation;

    private String goalStation;

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId == null ? null : rideId.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo == null ? null : trainNo.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBeginStation() {
        return beginStation;
    }

    public void setBeginStation(String beginStation) {
        this.beginStation = beginStation == null ? null : beginStation.trim();
    }

    public String getGoalStation() {
        return goalStation;
    }

    public void setGoalStation(String goalStation) {
        this.goalStation = goalStation == null ? null : goalStation.trim();
    }
}
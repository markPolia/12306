package com.github.markPolia.action.domain;

public class Train {
    private String trainNo;

    private String trainType;

    private Integer seatBusiness;

    private Integer seatSoft;

    private Integer seatHard;

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo == null ? null : trainNo.trim();
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType == null ? null : trainType.trim();
    }

    public Integer getSeatBusiness() {
        return seatBusiness;
    }

    public void setSeatBusiness(Integer seatBusiness) {
        this.seatBusiness = seatBusiness;
    }

    public Integer getSeatSoft() {
        return seatSoft;
    }

    public void setSeatSoft(Integer seatSoft) {
        this.seatSoft = seatSoft;
    }

    public Integer getSeatHard() {
        return seatHard;
    }

    public void setSeatHard(Integer seatHard) {
        this.seatHard = seatHard;
    }
}
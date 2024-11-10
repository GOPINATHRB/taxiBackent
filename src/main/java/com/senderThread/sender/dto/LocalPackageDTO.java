package com.senderThread.sender.dto;

public class LocalPackageDTO {

    private String vehicleType;
    private Double firstFourtyKm;
    private Double secondFourtyKm;
    private Double thirdFourtyKm;
    private Double outStationPerKm;
    private Double waitingHours;

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Double getFirstFourtyKm() {
        return firstFourtyKm;
    }

    public void setFirstFourtyKm(Double firstFourtyKm) {
        this.firstFourtyKm = firstFourtyKm;
    }

    public Double getSecondFourtyKm() {
        return secondFourtyKm;
    }

    public void setSecondFourtyKm(Double secondFourtyKm) {
        this.secondFourtyKm = secondFourtyKm;
    }

    public Double getThirdFourtyKm() {
        return thirdFourtyKm;
    }

    public void setThirdFourtyKm(Double thirdFourtyKm) {
        this.thirdFourtyKm = thirdFourtyKm;
    }

    public Double getOutStationPerKm() {
        return outStationPerKm;
    }

    public void setOutStationPerKm(Double outStationPerKm) {
        this.outStationPerKm = outStationPerKm;
    }

    public Double getWaitingHours() {
        return waitingHours;
    }

    public void setWaitingHours(Double waitingHours) {
        this.waitingHours = waitingHours;
    }
}

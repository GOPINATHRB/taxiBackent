package com.senderThread.sender.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LocalPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vehicleType;
    private Double firstFourtyKm;
    private Double secondFourtyKm;
    private Double thirdFourtyKm;
    private Double outStationPerKm;
    private Double waitingHours;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public LocalPackage() {

    }

    @Override
    public String toString() {
        return "LocalPackage{" +
                "id=" + id +
                ", vehicleType='" + vehicleType + '\'' +
                ", firstFourtyKm=" + firstFourtyKm +
                ", secondFourtyKm=" + secondFourtyKm +
                ", thirdFourtyKm=" + thirdFourtyKm +
                ", outStationPerKm=" + outStationPerKm +
                ", waitingHours=" + waitingHours +
                '}';
    }



}

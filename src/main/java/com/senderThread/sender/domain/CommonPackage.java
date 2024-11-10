package com.senderThread.sender.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CommonPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vehicleType;
    private Double kilometer;
    private Double localRate;
    private Double packageExtraKm;

    // Getters and Setters


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

    public Double getKilometer() {
        return kilometer;
    }

    public void setKilometer(Double kilometer) {
        this.kilometer = kilometer;
    }

    public Double getLocalRate() {
        return localRate;
    }

    public void setLocalRate(Double localRate) {
        this.localRate = localRate;
    }

    public Double getPackageExtraKm() {
        return packageExtraKm;
    }

    public void setPackageExtraKm(Double packageExtraKm) {
        this.packageExtraKm = packageExtraKm;
    }


    public CommonPackage(){

    }

    @Override
    public String toString() {
        return "CommonPackage{" +
                "id=" + id +
                ", vehicleType='" + vehicleType + '\'' +
                ", kilometer=" + kilometer +
                ", localRate=" + localRate +
                ", packageExtraKm=" + packageExtraKm +
                '}';
    }
}


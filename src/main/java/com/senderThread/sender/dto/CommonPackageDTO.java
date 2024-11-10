package com.senderThread.sender.dto;

public class CommonPackageDTO {

    private String vehicleType;
    private Double kilometer;
    private Double localRate;
    private Double packageExtraKm;

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
}

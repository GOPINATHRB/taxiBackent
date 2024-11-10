package com.senderThread.sender.dto;

public class YercaudPackageDTO {

    private String vehicleType;
    private Double dropYercaud;
    private Double dropPackage;
    private Double kilometer;
    private Double amount;
    private Double addKM;
    private Double addHours;


    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Double getDropYercaud() {
        return dropYercaud;
    }

    public void setDropYercaud(Double dropYercaud) {
        this.dropYercaud = dropYercaud;
    }

    public Double getDropPackage() {
        return dropPackage;
    }

    public void setDropPackage(Double dropPackage) {
        this.dropPackage = dropPackage;
    }

    public Double getKilometer() {
        return kilometer;
    }

    public void setKilometer(Double kilometer) {
        this.kilometer = kilometer;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAddKM() {
        return addKM;
    }

    public void setAddKM(Double addKM) {
        this.addKM = addKM;
    }

    public Double getAddHours() {
        return addHours;
    }

    public void setAddHours(Double addHours) {
        this.addHours = addHours;
    }
}

package com.senderThread.sender.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class YercaudPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vehicleType;
    private Double dropYercaud;
    private Double dropPackage;
    private Double kilometer;
    private Double amount;
    private Double addKM;
    private Double addHours;

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

    @Override
    public String toString() {
        return "YercaudPackageRepository{" +
                "id=" + id +
                ", vehicleType='" + vehicleType + '\'' +
                ", dropYercaud=" + dropYercaud +
                ", dropPackage=" + dropPackage +
                ", kilometer=" + kilometer +
                ", amount=" + amount +
                ", addKM=" + addKM +
                ", addHours=" + addHours +
                '}';
    }

    public YercaudPackage(){

    }
}


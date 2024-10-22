package com.senderThread.sender.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RideBookingDTO {

    private String customerName;
    private String phoneNumber;
    private String pickupLocation;
    private String carModel;
    private String dropLocation;
    private LocalDateTime pickupDateTime;
    private LocalDateTime returnDateTime;
    private String tourDestination;
    private BigDecimal numberOfDays;
    private BigDecimal rentPerKM;
    private BigDecimal totalKM;
    private BigDecimal driverFee;
    private String driverName;
    private BigDecimal tollCharge;
    private BigDecimal receivedAmount;
    private BigDecimal openingKM;
    private BigDecimal closingKM;
    private BigDecimal extraCharge;
    private BigDecimal rentPerDay;
    private String modeOfPayment;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public LocalDateTime getPickupDateTime() {
        return pickupDateTime;
    }

    public void setPickupDateTime(LocalDateTime pickupDateTime) {
        this.pickupDateTime = pickupDateTime;
    }

    public LocalDateTime getReturnDateTime() {
        return returnDateTime;
    }

    public void setReturnDateTime(LocalDateTime returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    public String getTourDestination() {
        return tourDestination;
    }

    public void setTourDestination(String tourDestination) {
        this.tourDestination = tourDestination;
    }

    public BigDecimal getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(BigDecimal numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public BigDecimal getRentPerKM() {
        return rentPerKM;
    }

    public void setRentPerKM(BigDecimal rentPerKM) {
        this.rentPerKM = rentPerKM;
    }

    public BigDecimal getTotalKM() {
        return totalKM;
    }

    public void setTotalKM(BigDecimal totalKM) {
        this.totalKM = totalKM;
    }

    public BigDecimal getDriverFee() {
        return driverFee;
    }

    public void setDriverFee(BigDecimal driverFee) {
        this.driverFee = driverFee;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public BigDecimal getTollCharge() {
        return tollCharge;
    }

    public void setTollCharge(BigDecimal tollCharge) {
        this.tollCharge = tollCharge;
    }

    public BigDecimal getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(BigDecimal receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public BigDecimal getOpeningKM() {
        return openingKM;
    }

    public void setOpeningKM(BigDecimal openingKM) {
        this.openingKM = openingKM;
    }

    public BigDecimal getClosingKM() {
        return closingKM;
    }

    public void setClosingKM(BigDecimal closingKM) {
        this.closingKM = closingKM;
    }

    public BigDecimal getExtraCharge() {
        return extraCharge;
    }

    public void setExtraCharge(BigDecimal extraCharge) {
        this.extraCharge = extraCharge;
    }

    public BigDecimal getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(BigDecimal rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }
}


package com.senderThread.sender.domain;


import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name = "ride_booking")
public class RideBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String customerName;

    @Column
    private String phoneNumber;

    @Column
    private String pickupLocation;

    @Column
    private String carModel;

    @Column
    private String dropLocation;

    @Column
    private LocalDateTime pickupDateTime;

    @Column
    private LocalDateTime returnDateTime;

    @Column
    private String tourDestination;


    @Column
    private BigDecimal numberOfDays;

    @Column
    private BigDecimal rentPerKM;


    @Column
    private BigDecimal totalKM;


    @Column
    private BigDecimal driverFee;

    @Column
    private String driverName;

    @Column
    private BigDecimal tollCharge;

    @Column
    private BigDecimal receivedAmount;

    @Column
    private BigDecimal openingKM;

    @Column
    private BigDecimal closingKM;

    @Column
    private BigDecimal extraCharge;

    @Column
    private BigDecimal rentPerDay;

    @Column
    private String modeOfPayment;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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


    public RideBooking(Long id) {
        this.id = id;
    }

    public RideBooking(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RideBooking that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getCustomerName(), that.getCustomerName()) && Objects.equals(getPhoneNumber(), that.getPhoneNumber()) && Objects.equals(getPickupLocation(), that.getPickupLocation()) && Objects.equals(getCarModel(), that.getCarModel()) && Objects.equals(getDropLocation(), that.getDropLocation()) && Objects.equals(getPickupDateTime(), that.getPickupDateTime()) && Objects.equals(getReturnDateTime(), that.getReturnDateTime()) && Objects.equals(getTourDestination(), that.getTourDestination()) && Objects.equals(getNumberOfDays(), that.getNumberOfDays()) && Objects.equals(getRentPerKM(), that.getRentPerKM()) && Objects.equals(getTotalKM(), that.getTotalKM()) && Objects.equals(getDriverFee(), that.getDriverFee()) && Objects.equals(getDriverName(), that.getDriverName()) && Objects.equals(getTollCharge(), that.getTollCharge()) && Objects.equals(getReceivedAmount(), that.getReceivedAmount()) && Objects.equals(getOpeningKM(), that.getOpeningKM()) && Objects.equals(getClosingKM(), that.getClosingKM()) && Objects.equals(getExtraCharge(), that.getExtraCharge()) && Objects.equals(getRentPerDay(), that.getRentPerDay()) && Objects.equals(getModeOfPayment(), that.getModeOfPayment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCustomerName(), getPhoneNumber(), getPickupLocation(), getCarModel(), getDropLocation(), getPickupDateTime(), getReturnDateTime(), getTourDestination(), getNumberOfDays(), getRentPerKM(), getTotalKM(), getDriverFee(), getDriverName(), getTollCharge(), getReceivedAmount(), getOpeningKM(), getClosingKM(), getExtraCharge(), getRentPerDay(), getModeOfPayment());
    }

    @Override
    public String toString() {
        return "RideBooking{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", carModel='" + carModel + '\'' +
                ", dropLocation='" + dropLocation + '\'' +
                ", pickupDateTime=" + pickupDateTime +
                ", returnDateTime=" + returnDateTime +
                ", tourDestination='" + tourDestination + '\'' +
                ", numberOfDays=" + numberOfDays +
                ", rentPerKM=" + rentPerKM +
                ", totalKM=" + totalKM +
                ", driverFee=" + driverFee +
                ", driverName='" + driverName + '\'' +
                ", tollCharge=" + tollCharge +
                ", receivedAmount=" + receivedAmount +
                ", openingKM=" + openingKM +
                ", closingKM=" + closingKM +
                ", extraCharge=" + extraCharge +
                ", rentPerDay=" + rentPerDay +
                ", modeOfPayment='" + modeOfPayment + '\'' +
                '}';
    }
}



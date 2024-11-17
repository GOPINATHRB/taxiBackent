package com.senderThread.sender.service;


import com.senderThread.sender.domain.RideBooking;
import com.senderThread.sender.dto.RideBookingDTO;
import com.senderThread.sender.repository.RideBookingRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class BillGenerationService {

    @Inject
    private RideBookingRepository rideBookingRepository;


    public RideBooking processBillGenerationDetails(RideBookingDTO rideBookingDTO){
        return prepareAndSaveBillGeneration(rideBookingDTO);
    }


    public RideBooking prepareAndSaveBillGeneration(RideBookingDTO rideBookingDTO){
       RideBooking rideBooking =convertDTOToDomain(rideBookingDTO);
       return saveBillGeneration(rideBooking);
    }

    private RideBooking saveBillGeneration(RideBooking rideBooking) {
        System.out.println("stating pdf generation save");
        //return rideBooking;
       rideBooking=rideBookingRepository.save(rideBooking);
       System.out.println("success");
        System.out.println("success"+rideBooking);
       return rideBooking;
    }

    private RideBooking convertDTOToDomain(RideBookingDTO rideBookingDTO) {

        RideBooking rideBooking = new RideBooking();

        rideBooking.setCarModel(rideBookingDTO.getCarModel());
        rideBooking.setClosingKM(rideBookingDTO.getClosingKM());
        rideBooking.setCustomerName(rideBookingDTO.getCustomerName());
        rideBooking.setDriverFee(rideBookingDTO.getDriverFee());
        rideBooking.setDriverName(rideBookingDTO.getDriverName());
        rideBooking.setDropLocation(rideBookingDTO.getDropLocation());
        rideBooking.setExtraCharge(rideBookingDTO.getExtraCharge());
        rideBooking.setModeOfPayment(rideBookingDTO.getModeOfPayment());
        rideBooking.setNumberOfDays(rideBookingDTO.getNumberOfDays());
        rideBooking.setOpeningKM(rideBookingDTO.getOpeningKM());
        rideBooking.setPhoneNumber(rideBookingDTO.getPhoneNumber());
        rideBooking.setPickupDateTime(rideBookingDTO.getPickupDateTime());
        rideBooking.setReceivedAmount(rideBookingDTO.getReceivedAmount());
        rideBooking.setRentPerDay(rideBookingDTO.getRentPerDay());
        rideBooking.setRentPerKM(rideBookingDTO.getRentPerKM());
        rideBooking.setPickupLocation(rideBookingDTO.getPickupLocation());
        rideBooking.setTotalKM(rideBookingDTO.getTotalKM());
        rideBooking.setTollCharge(rideBookingDTO.getTollCharge());
        rideBooking.setReturnDateTime(rideBookingDTO.getReturnDateTime());
        rideBooking.setTourDestination("");
        return  rideBooking;

    }
}

package com.senderThread.sender.repository;

import com.senderThread.sender.domain.RideBooking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RideBookingRepository extends JpaRepository<RideBooking,Long>  {
}

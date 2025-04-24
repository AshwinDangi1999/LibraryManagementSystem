package com.lms.LibraryManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.LibraryManagementSystem.Entity.Reservation;
import com.lms.LibraryManagementSystem.Repository.ReservationRepository;

@Service
public class ReservationService {
  
  @Autowired
  private ReservationRepository reservationRepository;

  public List<Reservation> getAllReservation(){
    return reservationRepository.findAll();
  }

}

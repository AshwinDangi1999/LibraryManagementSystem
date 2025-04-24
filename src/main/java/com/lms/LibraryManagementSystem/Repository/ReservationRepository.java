package com.lms.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.LibraryManagementSystem.Entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
  
}

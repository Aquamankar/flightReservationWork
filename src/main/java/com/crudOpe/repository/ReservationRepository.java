package com.crudOpe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudOpe.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
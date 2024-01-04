package com.crudOpe.service;

import com.crudOpe.entity.Reservation;
import com.crudOpe.payload.ReservationRequest;

public interface ReservationService {
Reservation bookFlight(ReservationRequest request);
}

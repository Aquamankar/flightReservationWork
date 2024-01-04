package com.crudOpe.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudOpe.entity.Flight;
import com.crudOpe.entity.Passenger;
import com.crudOpe.entity.Reservation;
import com.crudOpe.payload.ReservationRequest;
import com.crudOpe.repository.FlightRepository;
import com.crudOpe.repository.PassengerRepository;
import com.crudOpe.repository.ReservationRepository;
import com.crudOpe.service.ReservationService;
import com.crudOpe.utill.EmailUtil;
import com.crudOpe.utill.PDFgenerator;



@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	private PassengerRepository passengerRepo;
	@Autowired
	private FlightRepository flightRepo;
	@Autowired
	private ReservationRepository reservationRepo;
	@Autowired
	private PDFgenerator pdfGenerator;
	@Autowired
	private EmailUtil emailUtil;

	@Override
	public Reservation bookFlight(ReservationRequest request) {
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setLastName(request.getLastName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		passengerRepo.save(passenger);
		long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
	
		reservationRepo.save(reservation);
		String filePath = "E:\\psa_sts_work\\flightReservation\\tickets\\reservation" + reservation.getId()+ ".pdf";
	pdfGenerator.generateItinerary(reservation, filePath);
		emailUtil.sendItinerary(passenger.getEmail(), filePath);
		return reservation;
	}
}
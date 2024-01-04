package com.crudOpe.controller;

import java.util.Optional;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudOpe.entity.Reservation;
import com.crudOpe.payload.ReservationUpdateRequest;
import com.crudOpe.repository.ReservationRepository;

@RestController
@RequestMapping("/rest")
public class ReservationRestController {
	
	@Autowired
	private ReservationRepository repo;
	
	@GetMapping("/request/{id}")
	public ResponseEntity<Reservation> getRestReservation(@PathVariable long id){
		
		Optional<Reservation> findById = repo.findById(id);
		
		 if (findById.isPresent()) {
	            Reservation reservation = findById.get();
	            return ResponseEntity.ok(reservation); // Return 200 OK with the reservation
	        } else {
	            return ResponseEntity.notFound().build(); // Return 404 Not Found if reservation is not found
	        }
	}
	@PutMapping("/update")
	public ResponseEntity<Reservation> updateReservation(@RequestBody ReservationUpdateRequest requetr){
	
		Optional<Reservation> findById = repo.findById(requetr.getId());
		Reservation reservation = findById.get();
		reservation.setCheckedIn(requetr.isCheckedIn());
		reservation.setNumberOfBags(requetr.getNumberOfBags());
		 Reservation save = repo.save(reservation);
		return new ResponseEntity<>(save,HttpStatus.CREATED);
	}

}

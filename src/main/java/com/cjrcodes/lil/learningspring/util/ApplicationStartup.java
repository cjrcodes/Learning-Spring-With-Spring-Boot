package com.cjrcodes.lil.learningspring.util;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.cjrcodes.lil.learningspring.data.Guest;
import com.cjrcodes.lil.learningspring.data.GuestRepository;
import com.cjrcodes.lil.learningspring.data.Reservation;
import com.cjrcodes.lil.learningspring.data.ReservationRepository;
import com.cjrcodes.lil.learningspring.data.Room;
import com.cjrcodes.lil.learningspring.data.RoomRepository;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent>{

	private final RoomRepository roomRepository;
	private final GuestRepository guestRepository;
	private final ReservationRepository reservationRepository;

	
	public ApplicationStartup(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
		this.roomRepository = roomRepository;
		this.guestRepository = guestRepository;
		this.reservationRepository = reservationRepository;
	}

	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		System.out.println("App Started");
		Iterable<Room> rooms = this.roomRepository.findAll();
		rooms.forEach(System.out::println);
		Iterable<Guest> guests = this.guestRepository.findAll();
		guests.forEach(System.out::println);
		Iterable<Reservation> reservations = this.reservationRepository.findAll();
		reservations.forEach(System.out::println);
	}
	
	
}

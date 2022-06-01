package com.cjrcodes.lil.learningspring.util;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.cjrcodes.lil.learningspring.data.Room;
import com.cjrcodes.lil.learningspring.data.RoomRepository;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent>{

	private final RoomRepository roomRepository;
	
	public ApplicationStartup(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		System.out.println("App Started");
		Iterable<Room> rooms = this.roomRepository.findAll();
		rooms.forEach(System.out::println);

	}
	
	
}

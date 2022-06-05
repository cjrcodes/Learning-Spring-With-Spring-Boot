package com.cjrcodes.lil.learningspring.business;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cjrcodes.lil.learningspring.data.Guest;
import com.cjrcodes.lil.learningspring.data.GuestRepository;

@Service
public class GuestService {

	
	private GuestRepository guestRepository;
	
	public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }
	
	
	
	
}


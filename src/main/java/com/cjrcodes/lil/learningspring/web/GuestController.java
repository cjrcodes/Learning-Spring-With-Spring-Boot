package com.cjrcodes.lil.learningspring.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cjrcodes.lil.learningspring.business.GuestService;
import com.cjrcodes.lil.learningspring.business.ReservationService;
import com.cjrcodes.lil.learningspring.data.Guest;

@Controller
@RequestMapping("/guests")
public class GuestController {
	
	private final ReservationService reservationService;
	
	public GuestController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String getGuests(Model model) {
		model.addAttribute("guests", this.reservationService.getGuests());

		return "guest";
	}

}

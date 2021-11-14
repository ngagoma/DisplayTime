package com.hervais.displaydate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalTime;
import java.util.Date;
import java.text.SimpleDateFormat;

@Controller
public class DashboardController {
	@RequestMapping("/")
	public String dashboard(Model model) {		
		return "index";
	}
	
//	
	@RequestMapping("/date")
	public String dateMessage(Model model) {
//		https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html#text
		SimpleDateFormat simpleDate = new SimpleDateFormat("E, 'the' dd 'of' MMMM, YYYY");
		Date d = new Date();
		String myDate = simpleDate.format(d);
		model.addAttribute("date", myDate);
		return "date";
	}
	
	
	@RequestMapping("/time")
	public String timeMessage(Model model) {
		String msg1 ="This is a Time template";
		LocalTime myObj = LocalTime.now();
		String myTime = myObj.getHour() + ":" + myObj.getMinute() + " PM";
		System.out.println("is it : " + myTime);
		
		model.addAttribute("msg1", msg1);
		model.addAttribute("time_now", myTime);
		
		return "time";
	}
	
//	@RequestMapping("")
//	public String timeMessage(Model model) {
//		String msg2 ="This is a date template";
//		model.addAttribute("msg2", msg2);
//		return "index";
//	}
	
	
}

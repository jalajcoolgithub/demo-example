package com.example.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	
	
	@RequestMapping("/{name}")
	public String name(@PathVariable("name") String name) {
	
		return "welcome "+name;
	}

	
//	
//	@RequestMapping("/form")
//	public ModelAndView home() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("home");
//		return mv;
//	}
//
//	@RequestMapping("/home")
//	public ModelAndView afterHome(Alien alien) {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("success");
//		mv.addObject("obj", alien);
//		return mv;
//
//	}
//
//	@RequestMapping(value = "/allAlien")
//	public List<Alien> getAll() {
//		Alien a1 = new Alien();
//		a1.setId("1");
//		a1.setName("jalaj1");
//
//		Alien a2 = new Alien();
//		a2.setId("2");
//		a2.setName("jalaj2");
//
//		Alien a3 = new Alien();
//		a3.setId("3");
//		a3.setName("jalaj3");
//
//		return Arrays.asList(a1, a2, a3);
//
//	}
}

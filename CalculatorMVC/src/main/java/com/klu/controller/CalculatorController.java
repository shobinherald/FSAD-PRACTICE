package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
	@Autowired
	private CalculatorService service;
	@RequestMapping("/add")
	public int add(@RequestParam int a,@RequestParam int b) {
		return service.add(a, b);
	}
	@RequestMapping("/subtract/{a}/{b}")
	public int subtract(@PathVariable int a,@PathVariable int b) {
		return service.subtract(a,b);
	}
	@RequestMapping("/multiply/{a}/{b}")
	public double multiply(@PathVariable int a,@PathVariable int b) {
		return service.multiply(a, b);
	}
	@RequestMapping("/divide/{a}/{b}")
	public double divide(@RequestParam int a,@RequestParam int b) {
		return service.divide(a, b);
	}
	@RequestMapping("/module/{a}/{b}")
	public double module(@PathVariable int a,@PathVariable int b) {
		return service.module(a, b);
	}

}
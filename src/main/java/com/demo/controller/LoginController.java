package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping(value = "/login")
	public String getLogin(@RequestParam String a, @RequestParam String b) {

		if (a.equals("dhanush") && b.equals("123")) {
			return "Login accept";
		} else {
			return "Login not accept";
		}

	}
	
	@GetMapping(value = "/max/{a}")
	public int getPalidrom(@PathVariable int a, @RequestParam int b) {

		if (a > b) {
			return a;
		} else {
			
			return b;
		}

	}
	
	@GetMapping(value = "/max1/{a}/{b}")
	public int getMax(@PathVariable int a, @PathVariable int b) {

		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	@GetMapping(value = "hello")
	public String hello() {

	return "Hello";
	}

}


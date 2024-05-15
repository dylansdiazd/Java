package com.example.demo;


@RestController
public class PrimeiroController{
	
	@RequestMapping 
	public String Ola() {
		return "Olá Spring Boot";
	}
}
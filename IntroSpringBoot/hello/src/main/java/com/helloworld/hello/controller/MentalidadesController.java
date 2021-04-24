package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mentalidades")

public class MentalidadesController 
{
	@GetMapping
	public String mentalidades()
	{
		return "Reponsabilidade pessoal e orientação ao detalhe";
	}
}

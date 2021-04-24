package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/objetivos")

public class ObjetivosController 
{	
	@GetMapping
	public String objetivos()
	{
		return "Reponsabilidade pessoal, orientação ao detalhe e persistência.";
	}

}

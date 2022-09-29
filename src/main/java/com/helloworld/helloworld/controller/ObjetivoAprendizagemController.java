package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Objetivo-Aprendizagem")
public class ObjetivoAprendizagemController {
	
	@GetMapping
	public String Objetivos() {
		return "<h1> Objetivos de Aprendizagem<h1><hr>"
				+ "<h3>"
				+ "<li>Melhorar minha Gestão de Tempo;"
				+ "<li>Estudar mais;"
				+ "<li>Descansar mais;"				
				+ "<li>Focar mais."
				+ "</h3>";		
				
	}
}
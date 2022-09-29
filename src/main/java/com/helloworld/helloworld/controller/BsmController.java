package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Bsm-Generation")
public class BsmController  {
	
	@GetMapping
	public String competenciasBSM() {
		return "<h1> BSM DA GENERATION <h1><hr>"
				+ "<br><h3>"
				+ "<li>Mentalidade de Crescimento"
				+ "<li>Persistência"
				+ "<li>Responsabilidade Pessoal"
				+ "<li>Orientação ao Futuro"
				+ "<li>Comunicação"
				+ "<li>Orientação ao Detalhe"
				+ "<li>Proatividade"
				+ "<li>Trabalho em Equipe"
				+ "</h3";
	}

}
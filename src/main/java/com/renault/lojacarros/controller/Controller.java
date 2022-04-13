package com.renault.lojacarros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.renault.lojacarros.model.Veiculo;
import com.renault.lojacarros.service.CarroService;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private CarroService carroService;
	
	@GetMapping("/carros")
	public ResponseEntity<Object>  buscarCarrosLuxo(@RequestParam(name = "tipo") String tipo) {
		return ResponseEntity.ok(carroService.buscarCarros(tipo));
		
	}
	
	
	@GetMapping
	public ResponseEntity<Object>  buscarCarros() {
		return ResponseEntity.ok(carroService.buscarCarros());
		
	}
	
	@GetMapping("/todos")
	public ResponseEntity<Object>  buscarCarrosTodos() {
		return ResponseEntity.ok(carroService.buscarCarrosTodos());
		
	}
	
	
	@PostMapping
	public ResponseEntity<Object> criar(@RequestBody Veiculo veiculo) {
		return ResponseEntity.ok(1);
		
	}

}

package com.malandro.bet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malandro.bet.dto.UsuarioDTO;
import com.malandro.bet.model.UsuarioModel;
import com.malandro.bet.repository.UsuarioRepository;

@RestController
@RequestMapping("api")

public class UsuarioController {

	@Autowired
	UsuarioRepository repository;
	@GetMapping("oi")
	 public String oi() {
		 return "oi";
	 }
	
	@PostMapping("/cadastrar")
	public ResponseEntity<?> salvarUsuario(@RequestBody UsuarioDTO user) {
		UsuarioModel usuario = new UsuarioModel(user);
		repository.save(usuario);
	return ResponseEntity.ok("usuario cadastrado");
}
	
}

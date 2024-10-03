package com.malandro.bet.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.malandro.bet.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {

}

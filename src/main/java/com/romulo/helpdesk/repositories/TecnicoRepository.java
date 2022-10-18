package com.romulo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romulo.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}

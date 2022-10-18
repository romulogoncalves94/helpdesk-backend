package com.romulo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romulo.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}

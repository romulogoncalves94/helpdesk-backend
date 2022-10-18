package com.romulo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romulo.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}

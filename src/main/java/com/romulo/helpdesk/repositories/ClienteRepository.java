package com.romulo.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romulo.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}

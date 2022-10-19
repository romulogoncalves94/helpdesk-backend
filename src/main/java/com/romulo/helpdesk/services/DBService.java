package com.romulo.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romulo.helpdesk.domain.Chamado;
import com.romulo.helpdesk.domain.Cliente;
import com.romulo.helpdesk.domain.Tecnico;
import com.romulo.helpdesk.domain.enums.Perfil;
import com.romulo.helpdesk.domain.enums.Prioridade;
import com.romulo.helpdesk.domain.enums.Status;
import com.romulo.helpdesk.repositories.ChamadoRepository;
import com.romulo.helpdesk.repositories.ClienteRepository;
import com.romulo.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Rômulo Gonçalves", "077.197.299-78", "romulo@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Mariana Moraes", "123.123.123-12", "mariana@gmail.com", "134");
		
		Chamado cha1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(cha1));
	}
}

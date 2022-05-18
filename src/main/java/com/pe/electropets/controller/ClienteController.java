package com.pe.electropets.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.pe.electropets.dto.ClienteDTO;
import com.pe.electropets.exception.ModeloNotFoundException;
import com.pe.electropets.model.Cliente;
import com.pe.electropets.service.IClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private ModelMapper mapper;
	
	@GetMapping
	public ResponseEntity<List<ClienteDTO>> listar() throws Exception{
		List<ClienteDTO> lista = clienteService.listar().stream().map(c -> mapper.map(c, ClienteDTO.class)).collect(Collectors.toList());
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ClienteDTO> listarPorId(@PathVariable("id") Integer id) throws Exception{
		Cliente cliente = clienteService.listarPorId(id);
		if(cliente == null) throw new ModeloNotFoundException("Cliente con Id "+ id +" no encontrado en la base de datos.");
		ClienteDTO clienteDTO  = mapper.map(cliente, ClienteDTO.class);
		return new ResponseEntity<>(clienteDTO, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> registrar(@Valid @RequestBody ClienteDTO clienteRequest) throws Exception {
		Cliente cliente = mapper.map(clienteRequest, Cliente.class);
		clienteService.registrar(cliente);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cliente.getIdCliente()).toUri();
		return ResponseEntity.created(location).build();
	}
}

package com.pe.electropets.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

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

import com.pe.electropets.dto.PresentacionDTO;
import com.pe.electropets.exception.ModeloNotFoundException;
import com.pe.electropets.model.Presentacion;
import com.pe.electropets.service.IPresentacionService;

@RestController
@RequestMapping("/presentaciones")
public class PresentacionController {

	@Autowired
	IPresentacionService presentacionService;
	
	@Autowired
	ModelMapper mapper;
	
	@GetMapping
	public ResponseEntity<List<PresentacionDTO>> listar() throws Exception {
		List<PresentacionDTO> lista = presentacionService.listar().stream().map(p -> mapper.map(p, PresentacionDTO.class)).collect(Collectors.toList());
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PresentacionDTO> listarPorId(@PathVariable("id")Integer id) throws Exception {
		Presentacion presentacion = presentacionService.listarPorId(id);
		if(presentacion == null) throw new ModeloNotFoundException("Presentacion con id " + id + " no encontrado en la base de datos.");
		PresentacionDTO presentacionResponse = mapper.map(presentacion, PresentacionDTO.class);
		return new ResponseEntity<>(presentacionResponse, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> registrar(@RequestBody PresentacionDTO presentacionRequest) throws Exception {
		Presentacion presentacion = mapper.map(presentacionRequest, Presentacion.class);
		presentacionService.registrar(presentacion);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(presentacion.getIdPresentacion()).toUri();
		return ResponseEntity.created(location).build();
	}
}

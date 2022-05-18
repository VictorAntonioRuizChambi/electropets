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

import com.pe.electropets.dto.VentaDTO;
import com.pe.electropets.exception.ModeloNotFoundException;
import com.pe.electropets.model.Venta;
import com.pe.electropets.service.IVentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {

	@Autowired
	private IVentaService ventaService;
	
	@Autowired
	private ModelMapper mapper;
	
	@GetMapping
	public ResponseEntity<List<VentaDTO>>listar() throws Exception{
		List<VentaDTO> lista = ventaService.listar().stream().map(p -> mapper.map(p,VentaDTO.class)).collect(Collectors.toList());
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<VentaDTO>listarPorId(@PathVariable("id") Integer id) throws Exception{
		Venta venta = ventaService.listarPorId(id);
		if(venta==null)throw new ModeloNotFoundException("Venta con Id "+ id +" no encontrado en la base de datos.");
		VentaDTO ventaResponse = mapper.map(venta, VentaDTO.class);
		return new ResponseEntity<>(ventaResponse, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> registrar(@Valid @RequestBody VentaDTO ventaDTO) throws Exception {
		Venta venta = mapper.map(ventaDTO, Venta.class);
		ventaService.registrar(venta);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(venta.getIdVenta()).toUri();
		return ResponseEntity.created(location).build();
	}
}

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

import com.pe.electropets.dto.ProductoDTO;
import com.pe.electropets.exception.ModeloNotFoundException;
import com.pe.electropets.model.Producto;
import com.pe.electropets.service.IProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private ModelMapper mapper;
	
	@GetMapping
	public ResponseEntity<List<ProductoDTO>>listar() throws Exception {
		List<ProductoDTO> lista = productoService.listar().stream().map(p -> mapper.map(p, ProductoDTO.class)).collect(Collectors.toList());
		return new ResponseEntity<>(lista,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductoDTO> listarPorId(@PathVariable("id") Integer id) throws Exception {
		Producto producto = productoService.listarPorId(id);
		if(producto == null) throw new ModeloNotFoundException("Producto con Id "+ id +" no encontrado en la base de datos.");
		ProductoDTO productoResponse = mapper.map(producto, ProductoDTO.class);
		return new ResponseEntity<>(productoResponse, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> registrar(@Valid @RequestBody ProductoDTO productoRequest) throws Exception {
		Producto producto = mapper.map(productoRequest, Producto.class);
		productoService.registrar(producto);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(producto.getIdProducto()).toUri();
		return ResponseEntity.created(location).build();
	}
}

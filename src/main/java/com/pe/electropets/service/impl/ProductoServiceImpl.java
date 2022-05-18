package com.pe.electropets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.electropets.model.Producto;
import com.pe.electropets.repo.IGenericRepo;
import com.pe.electropets.repo.IProductoRepo;
import com.pe.electropets.service.IProductoService;

@Service
public class ProductoServiceImpl extends CRUDImpl<Producto, Integer> implements IProductoService{

	@Autowired
	IProductoRepo productoRepo;
	
	@Override
	protected IGenericRepo<Producto, Integer> getRepo() {
		return productoRepo;
	}

}

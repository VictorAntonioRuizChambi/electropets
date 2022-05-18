package com.pe.electropets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.electropets.model.Cliente;
import com.pe.electropets.repo.IClienteRepo;
import com.pe.electropets.repo.IGenericRepo;
import com.pe.electropets.service.IClienteService;

@Service
public class ClienteServiceImpl extends CRUDImpl<Cliente, Integer> implements IClienteService {

	@Autowired
	IClienteRepo repo;
	
	@Override
	protected IGenericRepo<Cliente, Integer> getRepo() {
		return repo;
	}

}

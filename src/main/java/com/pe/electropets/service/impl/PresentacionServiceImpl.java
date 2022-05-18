package com.pe.electropets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.electropets.model.Presentacion;
import com.pe.electropets.repo.IGenericRepo;
import com.pe.electropets.repo.IPresentacionRepo;
import com.pe.electropets.service.IPresentacionService;

@Service
public class PresentacionServiceImpl extends CRUDImpl<Presentacion, Integer> implements IPresentacionService{

	@Autowired
	IPresentacionRepo presentacionRepo;
	@Override
	protected IGenericRepo<Presentacion, Integer> getRepo() {
		return presentacionRepo;
	}

}

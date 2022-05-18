package com.pe.electropets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.electropets.model.Venta;
import com.pe.electropets.repo.IDetalleVentaRepo;
import com.pe.electropets.repo.IGenericRepo;
import com.pe.electropets.repo.IVentaRepo;
import com.pe.electropets.service.IVentaService;

@Service
public class VentaServiceImpl extends CRUDImpl<Venta, Integer> implements IVentaService{

	@Autowired
	IVentaRepo repo;
	
	@Autowired
	IDetalleVentaRepo dVentaRepo;
	
	@Override
	protected IGenericRepo<Venta, Integer> getRepo() {
		return repo;
	}

	@Override
	public Venta registrar(Venta venta) throws Exception {
		venta.getDetalleVenta().forEach(det -> det.setVenta(venta));
		repo.save(venta);
		return venta;
	}

}

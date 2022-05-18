package com.pe.electropets.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import com.pe.electropets.model.Producto;
import com.pe.electropets.model.Stock;

public class PresentacionDTO {

	private Integer idPresentacion;
	
	@NotNull
	private Producto producto;
	
	private String descripcion;
	
	private String unidadMedida;
	
	@NotNull
	private BigDecimal precioCosto;
	
	@NotNull
	private BigDecimal precioVentaMinima;
	
	@NotNull
	private BigDecimal precioVentaMaxima;
	
	@NotNull
	private String estado;
	
	@NotNull
	private Stock stock;

	public Integer getIdPresentacion() {
		return idPresentacion;
	}

	public void setIdPresentacion(Integer idPresentacion) {
		this.idPresentacion = idPresentacion;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public BigDecimal getPrecioCosto() {
		return precioCosto;
	}

	public void setPrecioCosto(BigDecimal precioCosto) {
		this.precioCosto = precioCosto;
	}

	public BigDecimal getPrecioVentaMinima() {
		return precioVentaMinima;
	}

	public void setPrecioVentaMinima(BigDecimal precioVentaMinima) {
		this.precioVentaMinima = precioVentaMinima;
	}

	public BigDecimal getPrecioVentaMaxima() {
		return precioVentaMaxima;
	}

	public void setPrecioVentaMaxima(BigDecimal precioVentaMaxima) {
		this.precioVentaMaxima = precioVentaMaxima;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
}

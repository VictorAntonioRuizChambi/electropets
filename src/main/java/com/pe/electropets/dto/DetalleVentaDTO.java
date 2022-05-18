package com.pe.electropets.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import com.pe.electropets.model.Presentacion;
import com.pe.electropets.model.Venta;

public class DetalleVentaDTO {

	private Integer idDetalleVenta;
	
	@NotNull
	private Venta venta;
	
	@NotNull
	private Presentacion presentacion;
	
	@NotNull
	private BigDecimal cantidad;
	
	@NotNull
	private BigDecimal precioVentaUnitario;
	
	@NotNull
	private BigDecimal precioVentaTotal;
	
	@NotNull
	private BigDecimal utilidad;
	
	@NotNull
	private String estado;

	public Integer getIdDetalleVenta() {
		return idDetalleVenta;
	}

	public void setIdDetalleVenta(Integer idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Presentacion getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(Presentacion presentacion) {
		this.presentacion = presentacion;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioVentaUnitario() {
		return precioVentaUnitario;
	}

	public void setPrecioVentaUnitario(BigDecimal precioVentaUnitario) {
		this.precioVentaUnitario = precioVentaUnitario;
	}

	public BigDecimal getPrecioVentaTotal() {
		return precioVentaTotal;
	}

	public void setPrecioVentaTotal(BigDecimal precioVentaTotal) {
		this.precioVentaTotal = precioVentaTotal;
	}

	public BigDecimal getUtilidad() {
		return utilidad;
	}

	public void setUtilidad(BigDecimal utilidad) {
		this.utilidad = utilidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}

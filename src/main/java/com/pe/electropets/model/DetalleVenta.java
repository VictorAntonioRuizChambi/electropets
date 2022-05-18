package com.pe.electropets.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetalleVenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetalleVenta;
	
	@ManyToOne
	@JoinColumn(name = "id_venta", nullable = false, foreignKey = @ForeignKey(name="FK_detalleVenta_venta"))
	private Venta venta;
	
	@ManyToOne
	@JoinColumn(name = "id_presentacion", nullable = false, foreignKey = @ForeignKey(name = "FK_detalleVenta_presentacion"))
	private Presentacion presentacion;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal cantidad;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal precioVentaUnitario;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal precioVentaTotal;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal utilidad;
	
	@Column(nullable = false, length = 2)
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

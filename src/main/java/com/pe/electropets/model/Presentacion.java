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
import javax.persistence.OneToOne;

@Entity
public class Presentacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPresentacion;
	
	@ManyToOne
	@JoinColumn(name = "id_producto", nullable = false, foreignKey = @ForeignKey(name= "FK_presentacion_producto"))
	private Producto producto;
	
	@Column(nullable = true, length = 250)
	private String descripcion;
	
	@Column(nullable = true, length = 20)
	private String unidadMedida;
	
	@Column(name = "prec_costo", nullable = false, precision = 10, scale = 3)
	private BigDecimal precioCosto;
	
	@Column(name = "prec_venta_min", nullable = false, precision = 10, scale = 3)
	private BigDecimal precioVentaMinima;
	
	@Column(name = "prec_venta_max", nullable = false, precision = 10, scale = 3)
	private BigDecimal precioVentaMaxima;
	
	@Column(nullable = false, length = 2)
	private String estado;
	
	@OneToOne(mappedBy = "presentacion")
	private Stock stock;

	public Integer getIdPresentacion() {
		return idPresentacion;
	}

	public void setIdPresentacion(Integer idPresentacion) {
		this.idPresentacion = idPresentacion;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
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

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
}

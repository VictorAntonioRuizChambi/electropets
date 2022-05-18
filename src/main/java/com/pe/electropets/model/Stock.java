package com.pe.electropets.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idStock;
	
	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "id_presentacion", foreignKey = @ForeignKey(name = "FK_stock_presentacion"))
	private Presentacion presentacion;
	
	@Column(name = "cant_min", nullable = false, precision = 10, scale = 3)
	private BigDecimal cantidadMinima;
	
	@Column(name = "cant_act", nullable = false, precision = 10, scale = 3)
	private BigDecimal cantidadActual;
	
	@Column(nullable = false, length = 2)
	private String estado;

	public Integer getIdStock() {
		return idStock;
	}

	public void setIdStock(Integer idStock) {
		this.idStock = idStock;
	}

	public Presentacion getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(Presentacion presentacion) {
		this.presentacion = presentacion;
	}

	public BigDecimal getCantidadMinima() {
		return cantidadMinima;
	}

	public void setCantidadMinima(BigDecimal cantidadMinima) {
		this.cantidadMinima = cantidadMinima;
	}

	public BigDecimal getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(BigDecimal cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}

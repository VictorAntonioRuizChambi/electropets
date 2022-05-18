package com.pe.electropets.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Diario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDiario;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal monto;
	
	@Column(nullable = false, precision = 10, scale = 3)
	private BigDecimal utilidad;
	
	@Column(nullable = false)
	private LocalDateTime fecha;
	
	@Column(nullable = false, length = 2)
	private String estado;
	
	public Integer getIdDiario() {
		return idDiario;
	}

	public void setIdDiario(Integer idDiario) {
		this.idDiario = idDiario;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public BigDecimal getUtilidad() {
		return utilidad;
	}

	public void setUtilidad(BigDecimal utilidad) {
		this.utilidad = utilidad;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}

package com.pe.electropets.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parametro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idParametro;
	
	@Column(name = "tip_param", nullable = false, length = 1)
	private String tipoParametro;
	
	@Column(name = "cod_param", nullable = false, length = 3)
	private String codigoParametro;
	
	@Column(name = "cod_det_param", nullable = false, length = 3)
	private String codigoDetalleParametro;
	
	@Column(name = "label_param", nullable = false, length = 50)
	private String etiquetaParametro;
	
	@Column(name = "value_param", nullable = false, length = 100)
	private String valorParametro;
	
	@Column(name = "desc_corta_param", nullable = false, length = 100)
	private String descripcionCortaParametro;
	
	@Column(name = "desc_larga_param", nullable = false, length = 250)
	private String descripcionLargaParametro;
	
	@Column(nullable = false, length = 2)
	private String estado;
	
	public Integer getIdParametro() {
		return idParametro;
	}

	public void setIdParametro(Integer idParametro) {
		this.idParametro = idParametro;
	}

	public String getTipoParametro() {
		return tipoParametro;
	}

	public void setTipoParametro(String tipoParametro) {
		this.tipoParametro = tipoParametro;
	}

	public String getCodigoParametro() {
		return codigoParametro;
	}

	public void setCodigoParametro(String codigoParametro) {
		this.codigoParametro = codigoParametro;
	}

	public String getCodigoDetalleParametro() {
		return codigoDetalleParametro;
	}

	public void setCodigoDetalleParametro(String codigoDetalleParametro) {
		this.codigoDetalleParametro = codigoDetalleParametro;
	}

	public String getEtiquetaParametro() {
		return etiquetaParametro;
	}

	public void setEtiquetaParametro(String etiquetaParametro) {
		this.etiquetaParametro = etiquetaParametro;
	}

	public String getValorParametro() {
		return valorParametro;
	}

	public void setValorParametro(String valorParametro) {
		this.valorParametro = valorParametro;
	}

	public String getDescripcionCortaParametro() {
		return descripcionCortaParametro;
	}

	public void setDescripcionCortaParametro(String descripcionCortaParametro) {
		this.descripcionCortaParametro = descripcionCortaParametro;
	}

	public String getDescripcionLargaParametro() {
		return descripcionLargaParametro;
	}

	public void setDescripcionLargaParametro(String descripcionLargaParametro) {
		this.descripcionLargaParametro = descripcionLargaParametro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}

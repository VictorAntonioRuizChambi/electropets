package com.pe.electropets.dto;

import javax.validation.constraints.NotNull;

public class ProductoDTO {
	
	private Integer idProducto;

	@NotNull
	private String codRubro;
	
	@NotNull
	private String codSeccion;
	
	@NotNull
	private String codProducto;
	
	private String descripcion;
	
	@NotNull
	private String estado;

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getCodRubro() {
		return codRubro;
	}

	public void setCodRubro(String codRubro) {
		this.codRubro = codRubro;
	}

	public String getCodSeccion() {
		return codSeccion;
	}

	public void setCodSeccion(String codSeccion) {
		this.codSeccion = codSeccion;
	}

	public String getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}

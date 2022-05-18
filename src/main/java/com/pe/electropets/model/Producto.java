package com.pe.electropets.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;

	@Column(nullable = false, length = 20)
	private String codRubro;
	
	@Column(nullable = false, length = 20)
	private String codSeccion;
	
	@Column(nullable = false, length = 20)
	private String codProducto;
	
	@Column(nullable = true, length = 250)
	private String descripcion;
	
	@Column(nullable = false, length = 2)
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

package com.pe.electropets.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@Column(nullable = true, length = 2)
	private String tipoDocumento;
	
	@Column(nullable = true, length = 30)
	private String numDocumento;
	
	@Column(nullable = true, length = 250)
	private String razonSocial;
	
	@Column(nullable = true, length = 50)
	private String apePaterno;
	
	@Column(nullable = true, length = 50)
	private String apeMaterno;
	
	@Column(nullable = true, length = 50)
	private String nombre1;
	
	@Column(nullable = true, length = 50)
	private String nombre2;
	
	@Column(nullable = true, length = 50)
	private String nombre3;
	
	@Column(nullable = true, length = 300)
	private String direccion;
	
	@Column(nullable = true, length = 30)
	private String telefono;
	
	@Column(nullable = true, length = 50)
	private String correo;
	
	@Column(nullable = false, length = 2)
	private String estado;
	
//	@Column(nullable = false, length = 20)
//	private String usuRegistro;
//	
//	@Column(nullable = false)
//	private LocalDateTime fecRegistro;
//	
//	@Column(nullable = true, length = 20)
//	private String usuModific;
//	
//	@Column(nullable = true)
//	private LocalDateTime fecModific;
	
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getNombre3() {
		return nombre3;
	}

	public void setNombre3(String nombre3) {
		this.nombre3 = nombre3;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}

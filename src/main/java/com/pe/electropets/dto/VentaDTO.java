package com.pe.electropets.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.pe.electropets.model.Cliente;
import com.pe.electropets.model.DetalleVenta;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Cliente DTO Data para envio de información entre el cliente y el modelo")
public class VentaDTO {

	private Integer idVenta;
	
	@NotNull
	private Cliente cliente;
	
	private String codComprobante;
	
	private BigDecimal total;
	
	private BigDecimal utilidad;
	
	@NotNull
	private LocalDateTime fecha;
	
	private String descripcion;
	
	private String estado;
	
	@NotNull
	private List<DetalleVenta> detalleVenta;

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getCodComprobante() {
		return codComprobante;
	}

	public void setCodComprobante(String codComprobante) {
		this.codComprobante = codComprobante;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
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

	public List<DetalleVenta> getDetalleVenta() {
		return detalleVenta;
	}

	public void setDetalleVenta(List<DetalleVenta> detalleVenta) {
		this.detalleVenta = detalleVenta;
	}
	
}

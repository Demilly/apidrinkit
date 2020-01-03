package com.apiback.drinkit.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Pedido implements Serializable{
	
	private static final long serialVersionUID = 418136939584716477L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_pedido;
	
	private Date data;
	
	private String status;
	
	private Double valor_total;

	public Long getCod_pedido() {
		return cod_pedido;
	}

	public void setCod_pedido(Long cod_pedido) {
		this.cod_pedido = cod_pedido;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getValor_total() {
		return valor_total;
	}

	public void setValor_total(Double valor_total) {
		this.valor_total = valor_total;
	}
	
	
	
}

package com.apiback.drinkit.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemPedido implements Serializable{

	private static final long serialVersionUID = 1438406467759589136L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_pedido_item;
	
	private Double valor_item;
	
	private Integer quantidade_item;

	public Long getCod_pedido_item() {
		return cod_pedido_item;
	}

	public void setCod_pedido_item(Long cod_pedido_item) {
		this.cod_pedido_item = cod_pedido_item;
	}

	public Double getValor_item() {
		return valor_item;
	}

	public void setValor_item(Double valor_item) {
		this.valor_item = valor_item;
	}

	public Integer getQuantidade_item() {
		return quantidade_item;
	}

	public void setQuantidade_item(Integer quantidade_item) {
		this.quantidade_item = quantidade_item;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}

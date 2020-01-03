package com.apiback.drinkit.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria implements Serializable{

	private static final long serialVersionUID = -373032207332339335L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_categoria;
	
	private String nomeCategoria;
	
	private String ativo;

	public Long getCod_categoria() {
		return cod_categoria;
	}

	public void setCod_categoria(Long cod_categoria) {
		this.cod_categoria = cod_categoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}

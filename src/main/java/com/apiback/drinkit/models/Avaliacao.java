package com.apiback.drinkit.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Avaliacao implements Serializable{

	private static final long serialVersionUID = -7053732896518074636L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_avaliacao;
	
	private Integer peso;
	
	private String sugestao;
	
	@DateTimeFormat
	private Date data;
	
	private String ativo;
	
	public Long getCod_avaliacao() {
		return cod_avaliacao;
	}

	public void setCod_avaliacao(Long cod_avaliacao) {
		this.cod_avaliacao = cod_avaliacao;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getSugestao() {
		return sugestao;
	}

	public void setSugestao(String sugestao) {
		this.sugestao = sugestao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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

package com.apiback.drinkit.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estado implements Serializable {

	private static final long serialVersionUID = 7375361959018996170L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_estado;

	private String nome;

	private char uf;
	
	@OneToMany(mappedBy = "estado")
	private List<Cidade> cidades = new ArrayList<Cidade>();

	public Long getCod_estado() {
		return cod_estado;
	}

	public void setCod_estado(Long cod_estado) {
		this.cod_estado = cod_estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getUf() {
		return uf;
	}

	public void setUf(char uf) {
		this.uf = uf;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}
	
}

package com.apiback.drinkit.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cidade implements Serializable {

	private static final long serialVersionUID = -963476122833424708L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_cidade;
	
	private String nome;
	
	private String cep;	
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
	private Estado estado;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
	private Cliente clienteCidade;
	
	@OneToMany(mappedBy = "cidadeEndereco")
	private List<Endereco> enderecos = new ArrayList<Endereco>();	
	
	public Long getCod_cidade() {
		return cod_cidade;
	}

	public void setCod_cidade(Long cod_cidade) {
		this.cod_cidade = cod_cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Cliente getClienteCidade() {
		return clienteCidade;
	}

	public void setClienteCidade(Cliente clienteCidade) {
		this.clienteCidade = clienteCidade;
	}
	
}

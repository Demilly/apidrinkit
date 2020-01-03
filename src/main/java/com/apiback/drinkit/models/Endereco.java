package com.apiback.drinkit.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Endereco implements Serializable {

	private static final long serialVersionUID = -3395126550228233204L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_endereco;
	
	private String rua;
	
	private String numero;
	
	private String complemento;
	
	private String referencia;
	
	private String bairro;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
	private Cidade cidadeEndereco;
	
	@OneToOne(mappedBy = "endereco")
	private Cliente cliente;

	public Long getCod_endereco() {
		return cod_endereco;
	}

	public void setCod_endereco(Long cod_endereco) {
		this.cod_endereco = cod_endereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Cidade getCidade() {
		return cidadeEndereco;
	}

	public void setCidade(Cidade cidadeEndereco) {
		this.cidadeEndereco = cidadeEndereco;
	}

	public Cidade getCidadeEndereco() {
		return cidadeEndereco;
	}

	public void setCidadeEndereco(Cidade cidadeEndereco) {
		this.cidadeEndereco = cidadeEndereco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}

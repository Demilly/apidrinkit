package com.apiback.drinkit.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Produto implements Serializable{

	private static final long serialVersionUID = 5134819304680044599L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_produto;
	
	@NotEmpty
	private String nome_produto;
	
	private String descricao_produto;
	
	@NotNull
	private Double valor;
	
	private String ativo;
	
	private String urlSeo;
	
//	@OneToMany(mappedBy = "produto")
//	private List<Produto> produtos = new ArrayList<Produto>();
	
	public Long getCod_produto() {
		return cod_produto;
	}

	public void setCod_produto(Long cod_produto) {
		this.cod_produto = cod_produto;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public String getDescricao_produto() {
		return descricao_produto;
	}

	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public String getUrlSeo() {
		return urlSeo;
	}

	public void setUrlSeo(String urlSeo) {
		this.urlSeo = urlSeo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

//	public List<Produto> getProdutos() {
//		return produtos;
//	}
//
//	public void setProdutos(List<Produto> produtos) {
//		this.produtos = produtos;
//	}
	
	
}

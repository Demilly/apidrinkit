package com.apiback.drinkit.models;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = -2845448646154627681L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod_cliente;
	
	@NotEmpty
	private String primeiroNome;
	
	@NotEmpty
	private String sobreNome;
	
	private String senha;

	@Transient
	private String confirmacaoSenha;
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String telefone;
	
	@NotEmpty
	private String cpf;
	
	@NotEmpty
	@DateTimeFormat
	private Date data_nascimento;
	
	@DateTimeFormat
	private Timestamp data_cadastro;
	
	private String ativo;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
	private Endereco endereco;
	
	
	@OneToOne(mappedBy = "clienteCidade")
	private Cidade cidade;	
	
	public Long getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(Long cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmacaoSenha() {
		return confirmacaoSenha;
	}

	public void setConfirmacaoSenha(String confirmacaoSenha) {
		this.confirmacaoSenha = confirmacaoSenha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Timestamp getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Timestamp data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}


	
}
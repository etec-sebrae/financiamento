package br.gov.sp.etec.financiamento.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class FinanEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cliente;
	private String endereco;
	private String numero;
	private String cidade;
	private String estado;
	private String cep;
	private String cpf;
	private String rg;
	private String datanas;
	private String email;
	private String telres;
	private String cel;
	private String tipofinan;
	private String qtdepar;
	private String valorint;
	private String sal;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDatanas() {
		return datanas;
	}
	public void setDatanas(String datanas) {
		this.datanas = datanas;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelres() {
		return telres;
	}
	public void setTelres(String telres) {
		this.telres = telres;
	}
	public String getCel() {
		return cel;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}
	public String getTipofinan() {
		return tipofinan;
	}
	public void setTipofinan(String tipofinan) {
		this.tipofinan = tipofinan;
	}
	public String getQtdepar() {
		return qtdepar;
	}
	public void setQtdepar(String qtdepar) {
		this.qtdepar = qtdepar;
	}
	public String getValorint() {
		return valorint;
	}
	public void setValorint(String valorint) {
		this.valorint = valorint;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	

}

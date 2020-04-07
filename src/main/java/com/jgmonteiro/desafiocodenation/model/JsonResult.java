package com.jgmonteiro.desafiocodenation.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "numero_casas", "token", "cifrado", "decifrado", "resumo_criptografico" })
public class JsonResult implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer numeroDeCasas;
	private String token;
	private String cifrado;
	private String decifrado;
	private String resumo;

	public JsonResult() {

	}

	@JsonGetter("numero_casas")
	public Integer getNumeroDeCasas() {
		return numeroDeCasas;
	}

	public void setNumeroDeCasas(Integer numeroDeCasas) {
		this.numeroDeCasas = numeroDeCasas;
	}

	@JsonGetter("token")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCifrado() {
		return cifrado;
	}

	public void setCifrado(String cifrado) {
		this.cifrado = cifrado;
	}

	public String getDecifrado() {
		return decifrado;
	}

	public void setDecifrado(String decifrado) {
		this.decifrado = decifrado;
	}

	@JsonGetter("resumo_criptografico")
	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

}

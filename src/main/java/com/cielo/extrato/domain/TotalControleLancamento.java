package com.cielo.extrato.domain;

import java.io.Serializable;

public class TotalControleLancamento implements Serializable{
	
	private static final long serialVersionUID = 7333422634817914832L;

	private Integer quantidadeLancamentos;
	
	private Integer quantidadeRemessas;
	
	private Double valorLancamentos;

	public Integer getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}

	public void setQuantidadeLancamentos(Integer quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}

	public Integer getQuantidadeRemessas() {
		return quantidadeRemessas;
	}

	public void setQuantidadeRemessas(Integer quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}

	public Double getValorLancamentos() {
		return valorLancamentos;
	}

	public void setValorLancamentos(Double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}

	

}

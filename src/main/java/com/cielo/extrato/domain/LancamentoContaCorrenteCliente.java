package com.cielo.extrato.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LancamentoContaCorrenteCliente implements Serializable{
	
	private static final long serialVersionUID = -7310525224885098232L;

	private Long numeroRemessaBanco;
	
	private String nomeSituacaoRemessa;
	
	@JsonIgnore
	private String dadosAnaliticoLancamentoFinanceiroCliente;
	
	private DomicilioBancario dadosDomicilioBancario;
	
	private String nomeTipoOperacao;

	public Long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	public DomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	public void setDadosDomicilioBancario(DomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	public String getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}

	public void setDadosAnaliticoLancamentoFinanceiroCliente(String dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}
	

}

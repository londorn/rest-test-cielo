package com.cielo.extrato.domain;

import java.io.Serializable;
import java.util.List;

public class Lancamentos implements Serializable{ 

	private static final long serialVersionUID = -6370445474153343453L;

	private TotalControleLancamento totalControleLancamento;
	
	private List<ControleLancemento> listaControleLancamento;
	
	private Integer indice;
	
	private Integer tamanhoPagina;
	
	private Integer totalElements;


	public List<ControleLancemento> getListaControleLancamento() {
		return listaControleLancamento;
	}

	public void setListaControleLancamento(List<ControleLancemento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}

	public Integer getIndice() {
		return indice;
	}

	public void setIndice(Integer indice) {
		this.indice = indice;
	}

	public Integer getTamanhoPagina() {
		return tamanhoPagina;
	}

	public void setTamanhoPagina(Integer tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}

	public Integer getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}

	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}


}

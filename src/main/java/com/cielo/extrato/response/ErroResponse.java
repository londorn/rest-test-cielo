package com.cielo.extrato.response;

public class ErroResponse {
	
    private String codigoErro;
	private String descricaoErro;
	
	public ErroResponse(String codigoErro, String descricaoErro) {
		this.codigoErro = codigoErro;
		this.descricaoErro = descricaoErro;
	}

	public String getCodigoErro() {
		return codigoErro;
	}

	public void setCodigoErro(String codigoErro) {
		this.codigoErro = codigoErro;
	}

	public String getDescricaoErro() {
		return descricaoErro;
	}

	public void setDescricaoErro(String descricaoErro) {
		this.descricaoErro = descricaoErro;
	}


	

}

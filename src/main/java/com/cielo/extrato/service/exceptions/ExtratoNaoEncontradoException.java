package com.cielo.extrato.service.exceptions;

public class ExtratoNaoEncontradoException extends RuntimeException{

	private static final long serialVersionUID = 1869300553614629710L;

	public ExtratoNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public ExtratoNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem);
	}
	
}

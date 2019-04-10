package com.cielo.extrato.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cielo.extrato.response.ErroResponse;
import com.cielo.extrato.service.exceptions.ExtratoNaoEncontradoException;

@ControllerAdvice
public class ExtratoExceptionHandler {
	
	@ExceptionHandler(ExtratoNaoEncontradoException.class)
	public ResponseEntity<ErroResponse> handlelivroNaoEncontradoException(ExtratoNaoEncontradoException e,
			HttpServletRequest request) {
		
		ErroResponse erro = new ErroResponse();
	    erro.setStatus(404l);
		erro.setTitulo("Extrato nao encontrado");
		erro.setMensagemDesenvolvedor("http://paginadeerro.com.br/404");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
}

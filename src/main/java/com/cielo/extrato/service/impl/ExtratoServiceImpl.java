package com.cielo.extrato.service.impl;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.cielo.extrato.domain.Lancamentos;
import com.cielo.extrato.service.ExtratoService;
import com.cielo.extrato.service.exceptions.ExtratoNaoEncontradoException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class ExtratoServiceImpl implements ExtratoService{
	
	private static final String JSON_FILE = "lancamento-conta-legado.json";
	
	 public Lancamentos buscarControleLancemento() {   
			
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			return	mapper.readValue(new File(JSON_FILE), Lancamentos.class);
		} catch (IOException  ex) {
		
			throw new ExtratoNaoEncontradoException("O Extratro nao encontrado ");
		}
		
	}
	
	
}

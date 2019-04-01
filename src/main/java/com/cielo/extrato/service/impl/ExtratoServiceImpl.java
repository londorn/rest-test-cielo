package com.cielo.extrato.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.cielo.extrato.domain.Lancamentos;
import com.cielo.extrato.service.ExtratoService;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class ExtratoServiceImpl implements ExtratoService{
	
	private static final String JSON_FILE = "lancamento-conta-legado.json";
	
	
	public Lancamentos buscarControleLancemento() throws FileNotFoundException, IOException {
			
				ObjectMapper mapper = new ObjectMapper();
			
	return mapper.readValue(new File(JSON_FILE), Lancamentos.class);
		
	}
	
	
}

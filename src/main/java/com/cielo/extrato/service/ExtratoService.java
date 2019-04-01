package com.cielo.extrato.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.cielo.extrato.domain.Lancamentos;

public interface ExtratoService {
	
	public Lancamentos buscarControleLancemento() throws FileNotFoundException, IOException;

}

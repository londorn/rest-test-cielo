package com.cielo.extrato.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cielo.extrato.domain.Lancamentos;
import com.cielo.extrato.response.ErroResponse;
import com.cielo.extrato.service.ExtratoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@Api(value = "Rest referente a entidade Lancamentos") 
@RequestMapping(value = "/extrato")
public class ExtratoController {
	
	
	private final Logger log = LoggerFactory.getLogger(ExtratoController.class);

	/**
	 * Injecao de dependencia para o servico do Extrato
	 */
	@Autowired
	private ExtratoService extratoService;
	
	
	@ApiOperation(value = "Buscar Extratos Lancamento", httpMethod = "GET", response = ExtratoController.class, notes = "Essa opera\u00e7\u00e3o busca uma lista de Lancamentos do Cliente")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "200 OK. Lista retornada com sucesso."),
	        @ApiResponse(code = 201, message = "201 CREATED. Registro salvo com sucesso."),
	        @ApiResponse(code = 204, message = "204 NO CONTENT. Nenhum registro encontrado."),
	        @ApiResponse(code = 400, message = "400 BAD REQUEST. Erro na busca?"),
	        @ApiResponse(code = 402, message = "402 UNAUTHORIZED. Você não está autorizado a acessar esse serviço."),
	        @ApiResponse(code = 403, message = "403 FORBIDDEN. Não é permitido acessar esse serviço."),
	        @ApiResponse(code = 404, message = "404 NOT FOUND. O serviço não foi encontrado."),
	        @ApiResponse(code = 405, message = "405 METHOD NOT ALLOWED. Método de requisição não esperado (GET ou POST)."),
	        @ApiResponse(code = 422, message = "422 UNPROCESSABLE ENTITY. Erro de validação."),
	        @ApiResponse(code = 500, message = "500 INTERNAL SERVER ERROR. Um erro ocorreu em nossa API.")
	})
	
	@GetMapping(value="/busca-extrato", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> buscaExtrato(){
		
		Lancamentos controleLancamento = new Lancamentos();
		
		log.debug("Inicio buscaExtrato()");
		
    	try {
    		
    		controleLancamento = extratoService.buscarControleLancemento();
    		
		} catch (IOException e) {
			log.debug("ERRO: " +e.getStackTrace()+" ");
			return new ResponseEntity<ErroResponse>(new ErroResponse("500","Erro Inesperado"), HttpStatus.INTERNAL_SERVER_ERROR);
		}
    	
    	log.debug("Fim buscaExtrato()");
    	
		return new ResponseEntity<Lancamentos>(controleLancamento, HttpStatus.OK);
	}
	
	

}

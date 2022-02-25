package com.senai.devinhouse.logging;

import com.senai.devinhouse.logging.service.MeuServico;
import com.senai.devinhouse.logging.service.MeuServico2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingApplication implements CommandLineRunner {

	@Value("${enabled.novaFuncionalidade}")
	private String novaFuncionalidade;

	@Autowired
	private MeuServico meuServico;

	@Autowired
	private MeuServico2 meuServico2;

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(Boolean.valueOf(novaFuncionalidade)) {
			LOGGER.warn("Este sistema está com a funcionalidade xpto ativa");
		}
		LOGGER.info("Bem vindo ao sistema!");

		LOGGER.trace("Mensagem de trace");
		LOGGER.debug("Mensagem de debug");
		LOGGER.info("Cadastro inserido com sucesso!");
		LOGGER.warn("Mensagem de warning");
		LOGGER.error("Mensagem de erro");
		//meuServico.configurar();
		//meuServico.salvar("Danilo");
		meuServico.avaliarAmbiente();
		meuServico2.inicializar();
	}
}

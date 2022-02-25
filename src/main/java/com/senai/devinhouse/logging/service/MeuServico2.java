package com.senai.devinhouse.logging.service;

import com.senai.devinhouse.logging.repository.ProdutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
public class MeuServico2 {

    @Autowired
    private ProdutoRepository produtoRepository;

    public void inicializar() {
        log.debug("Inicializando Serviço 2");
        produtoRepository.salvar("Lapiseira", new BigDecimal("2.00"));
    }

}

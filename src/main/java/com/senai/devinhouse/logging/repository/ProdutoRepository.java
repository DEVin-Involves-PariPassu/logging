package com.senai.devinhouse.logging.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
@Slf4j
public class ProdutoRepository {

    public void salvar(String nomeProduto, BigDecimal valor) {
        // salva no banco de dados
        log.debug("Produto {} com valor {} salvo com sucesso", nomeProduto, valor);
    }
}

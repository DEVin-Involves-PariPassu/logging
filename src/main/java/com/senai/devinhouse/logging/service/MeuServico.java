package com.senai.devinhouse.logging.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.InputStream;

@Service
@Slf4j
public class MeuServico {

    public void salvar(String nome) {
        // faz a inserção no banco.
        if(nome.length() < 3) {
            log.error("O nome menor que 3 caracteres");
            return;
        }
    }

    // java.io e java.nio
    @Deprecated
    /**
     * Este método será removido no futuro utilizar o método configurar(String caminhoDoArquivo)
     */
    public void configurar() {
        log.warn("Troque a porta de segurança de e-mail para 587");
        if(!new File("lista_usuarios.csv").exists()) {
            log.error("Arquivo lista_usuario.csv não existe no classpath");
            throw new RuntimeException();
        }
    }

    public void avaliarAmbiente() {
        log.info("Avaliando ambiente necessário");
        long memoria = Runtime.getRuntime().freeMemory();
        log.debug("Verificando mémoria disponivel: " + memoria);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        log.debug("Avaliando disponibilidade de processadores");
        //alocarProcessadoresDisponiveis();

    }
}

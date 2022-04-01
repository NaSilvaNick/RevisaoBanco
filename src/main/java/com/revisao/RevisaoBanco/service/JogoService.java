package com.revisao.RevisaoBanco.service;

import com.revisao.RevisaoBanco.model.Jogo;
import com.revisao.RevisaoBanco.request.JogoRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class JogoService {

    public Jogo cadastraJogo(JogoRequest jogoRequest){
        return new Jogo(
                UUID.randomUUID(),
                jogoRequest.getNome(),
                jogoRequest.getDescricao(),
                jogoRequest.getAnoCriacao(),
                jogoRequest.getCodigoSecreto());
    }
}

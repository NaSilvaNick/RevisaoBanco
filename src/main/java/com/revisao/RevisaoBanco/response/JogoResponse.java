package com.revisao.RevisaoBanco.response;

import com.revisao.RevisaoBanco.model.Jogo;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
public class JogoResponse {

    private UUID id;
    private String nome;
    private String descricao;
    private Integer anoCriacao;

    public JogoResponse(Jogo jogo) {
        this.id = jogo.getId();
        this.nome = jogo.getNome();
        this.descricao = jogo.getDescricao();
        this.anoCriacao = jogo.getAnoCriacao();
    }
}

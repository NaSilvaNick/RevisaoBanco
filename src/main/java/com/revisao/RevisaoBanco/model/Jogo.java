package com.revisao.RevisaoBanco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@ToString
@Getter
@AllArgsConstructor
public class Jogo {
    private UUID id;
    private String nome;
    private String descricao;
    private Integer anoCriacao;
    private String codigoSecreto;
}

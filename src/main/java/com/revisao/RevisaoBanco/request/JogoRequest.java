package com.revisao.RevisaoBanco.request;

import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class JogoRequest {

    @NotNull @NotEmpty @Size(min = 3)
    private String nome;

    @NotNull
    private String descricao;

    @NotNull
    private Integer anoCriacao;

    @NotNull @NotEmpty @Size(min = 2)
    private String codigoSecreto;
}

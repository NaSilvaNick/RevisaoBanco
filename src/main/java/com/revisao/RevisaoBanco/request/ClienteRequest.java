package com.revisao.RevisaoBanco.request;

import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class ClienteRequest {

    @NotEmpty @NotNull @Size(min = 2)
    private String nome;

    @NotEmpty @NotNull
    private String email;

    @NotEmpty @NotNull @Size(min = 3)
    private String senha;
}

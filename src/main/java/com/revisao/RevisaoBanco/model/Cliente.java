package com.revisao.RevisaoBanco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@ToString
@Getter @Setter
@AllArgsConstructor
public class Cliente {
    private UUID id;
    private String nome;
    private String email;
    private String senha;
}

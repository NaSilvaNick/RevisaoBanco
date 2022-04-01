package com.revisao.RevisaoBanco.service;

import com.revisao.RevisaoBanco.model.Cliente;
import com.revisao.RevisaoBanco.request.ClienteRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ClienteService {

    public Cliente cadastraCliente(ClienteRequest clienteRequest){
        return new Cliente(
                UUID.randomUUID(),
                clienteRequest.getNome(),
                clienteRequest.getEmail(),
                clienteRequest.getSenha());
    }
}

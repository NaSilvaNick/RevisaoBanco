package com.revisao.RevisaoBanco.controller;

import com.revisao.RevisaoBanco.database.ClienteDB;
import com.revisao.RevisaoBanco.model.Cliente;
import com.revisao.RevisaoBanco.request.ClienteRequest;
import com.revisao.RevisaoBanco.response.ClienteResponse;
import com.revisao.RevisaoBanco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteDB clienteDB;

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteResponse> cadastraCliente(
            @RequestBody @Valid ClienteRequest clienteRequest,
            UriComponentsBuilder uriComponentsBuilder
    ){
        Cliente cliente = clienteService.cadastraCliente(clienteRequest);

        this.clienteDB.add(cliente);

        URI uri = uriComponentsBuilder.path("cliente/{id}")
                .buildAndExpand(cliente.getId()).toUri();

        return ResponseEntity.created(uri).body(new ClienteResponse(cliente));
    }

    @GetMapping
    public List<ClienteResponse> buscaCliente(){
        return this.clienteDB.getClientesResponse();
    }
}

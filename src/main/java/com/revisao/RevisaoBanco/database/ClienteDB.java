package com.revisao.RevisaoBanco.database;

import com.revisao.RevisaoBanco.model.Cliente;
import com.revisao.RevisaoBanco.response.ClienteResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ClienteDB {

    private List<Cliente> lista;
    private List<ClienteResponse> listaResponse;

    public ClienteDB(){
        Cliente cliente = new Cliente(
                UUID.randomUUID(),
                "Nickolas",
                "nickolas@email.com",
                "1234"
        );
        this.lista = new ArrayList<>();
        this.lista.add(cliente);

        this.listaResponse = new ArrayList<>();
        this.listaResponse.add(new ClienteResponse(cliente));
    }

    public void add(Cliente cliente){
        this.lista.add(cliente);
        this.listaResponse.add(new ClienteResponse(cliente));
    }

    public List<ClienteResponse> getClientesResponse(){
        return this.listaResponse;
    }
}

package com.revisao.RevisaoBanco.controller;

import com.revisao.RevisaoBanco.database.JogoDB;
import com.revisao.RevisaoBanco.model.Jogo;
import com.revisao.RevisaoBanco.request.JogoRequest;
import com.revisao.RevisaoBanco.response.JogoResponse;
import com.revisao.RevisaoBanco.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/jogo")
public class JogoController {

    @Autowired
    private JogoDB jogoDB;

    @Autowired
    private JogoService jogoService;

    @PostMapping
    public ResponseEntity<JogoResponse> cadastraJogo(
            @RequestBody @Valid JogoRequest jogoRequest,
            UriComponentsBuilder uriComponentsBuilder
    ){
        Jogo jogo = jogoService.cadastraJogo(jogoRequest);

        this.jogoDB.add(jogo);

        URI uri = uriComponentsBuilder.path("jogo/{id}")
                .buildAndExpand(jogo.getId()).toUri();

        return ResponseEntity.created(uri).body(new JogoResponse(jogo));
    }

    @GetMapping
    public List<JogoResponse> buscaJogo(){
        return jogoDB.getJogosResponse();
    }
}


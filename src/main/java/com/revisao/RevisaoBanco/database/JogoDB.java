package com.revisao.RevisaoBanco.database;

import com.revisao.RevisaoBanco.model.Cliente;
import com.revisao.RevisaoBanco.model.Jogo;
import com.revisao.RevisaoBanco.response.ClienteResponse;
import com.revisao.RevisaoBanco.response.JogoResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class JogoDB {

    private List<Jogo> lista;
    private List<JogoResponse> listaResponse;

    public JogoDB(){
        Jogo jogo = new Jogo(
                UUID.randomUUID(),
                "Battle Royale",
                "Jogo Muito legal de se jogar",
                2012,
                "5318756"
        );

        this.lista = new ArrayList<>();
        this.lista.add(jogo);

        this.listaResponse = new ArrayList<>();
        this.listaResponse.add(new JogoResponse(jogo));
    }

    public void add(Jogo jogo){
        this.lista.add(jogo);
        this.listaResponse.add(new JogoResponse(jogo));
    }

    public List<JogoResponse> getJogosResponse(){
        return this.listaResponse;
    }
}

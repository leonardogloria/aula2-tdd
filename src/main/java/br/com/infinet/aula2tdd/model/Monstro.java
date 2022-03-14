package br.com.infinet.aula2tdd.model;

import lombok.Builder;
import lombok.Data;

@Builder@Data
public class Monstro {
    private String id;
    private String nome;
    private Long pontosDeVida;

}

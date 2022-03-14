package br.com.infinet.aula2tdd.util;

import br.com.infinet.aula2tdd.model.Monstro;

import java.util.List;

public class MonstrosCrew {
    private List<Monstro> crew;
    public MonstrosCrew(List<Monstro> crew) {
        this.crew = crew;
    }


}
/*

- Se a crew só tiver um monstro, ele será o maior.
- Se não possuir nenhum, null será o maior
- Se numeroMonstros > 1 o com maior pontos de vida deve ser retornado.


 */
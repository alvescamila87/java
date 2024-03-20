package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Pessoa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrincipalSet {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Princesa Isabel", "61681651");
        Pessoa pessoa2 = new Pessoa("Dom Manoel", "8961981981");

        //supertipo
        //List<Pessoa> pessoas = new ArrayList<>();
        Set<Pessoa> pessoas = new HashSet<>();

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        Pessoa pessoa4 = new Pessoa("Princesa Isabel", "61681651");

        boolean existe = pessoas.contains(pessoa4);
        System.out.println("Existe: " + existe);

    }
}

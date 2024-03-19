package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PrincipalArrayList {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Princesa Isabel", "61681651");
        //System.out.println(pessoa1.toString());
        Pessoa pessoa2 = new Pessoa("Dom Manoel", "8961981981");

        //supertipo
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

        //System.out.println(pessoas);

        Pessoa pessoa3 = pessoas.get(1);
        System.out.println(pessoa3);

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i).getNome());
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        Pessoa pessoa4 = new Pessoa("Princesa Isabel", "61681651");

        boolean existe = pessoas.contains(pessoa4);
        System.out.println("Existe: " + existe);

        // comparar conteúdo
        System.out.println("Equals: " + pessoa1.equals(pessoa4));

        // comparar instância (endereço de memória)
        System.out.println(pessoa1 == pessoa4);

    }
}

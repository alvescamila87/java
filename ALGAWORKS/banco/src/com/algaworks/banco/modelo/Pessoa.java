package com.algaworks.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Pessoa extends Object {

    private String nome;
    private String documento;

    // wrapper
    private BigDecimal rendimentoAnual;

    //enum
    // type safe
    private TipoPessoa tipoPessoa = TipoPessoa.FISICA;

    // data e hora: iso 8601
    // sem informação de fuso horário
    private LocalDateTime dataUltimaAtualizacao = LocalDateTime.now();

    // uso com arraylist
    public Pessoa() {
    }

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public BigDecimal getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual(BigDecimal rendimentoAnual) {
        this.rendimentoAnual = rendimentoAnual;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public LocalDateTime getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    // uso com arraylist

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", tipoPessoa=" + tipoPessoa +
                '}';
    }
    /*
    // comparar igualdade depende do negócio
    @Override
    public boolean equals(Object obj) {
        // verificar se a referência é a mesma
        if(this == obj) return true;

        // se o objeto recebido é null
        if(obj == null) return false;

        // se a classe do objeto é diferente
        if(getClass() != obj.getClass()) return false;

        // se 2 objetos diferentes possuirem o mesmo documento, são iguais
        Pessoa pessoa = (Pessoa) obj;
        return documento.equals(pessoa.documento);
    }

    // método de geração de hash: que retorna um código para categorizar o objeto em tabelas de espalhamento
    @Override
    public int hashCode() {
        return 1;
    }
    */

    // melhor prática, gerar equals e hash juntos

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(documento, pessoa.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }
}

package com.algaworks.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pessoa {

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
}

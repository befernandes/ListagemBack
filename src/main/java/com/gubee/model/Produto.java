package com.gubee.model;

public class Produto {
    private Integer id;
    private String  nome;
    private String descricao;
    private String mercado;
    private String tecnologia;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public Produto(Integer id,String nome, String descricao, String mercado, String tecnologia) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.mercado = mercado;
        this.tecnologia = tecnologia;
    }
}

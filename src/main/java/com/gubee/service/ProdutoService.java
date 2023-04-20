package com.gubee.service;

import com.gubee.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();
    private Long ultimoId = 0L;
    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos);
    }
    public Produto criarProduto(Produto produto) {
        Produto produto1 = new Produto(1,"nome1","descricao1","mercado1","tecnologia1");
        Produto produto2 = new Produto(2,"nome2","descricao2","mercado2","tecnologia2");
        Produto produto3 = new Produto(3,"nome3","descricao3","mercado3","tecnologia3");

        produtos.add(produto);
        return produto;
    }
}

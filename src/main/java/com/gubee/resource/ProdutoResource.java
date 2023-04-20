package com.gubee.resource;

import com.gubee.model.Produto;
import com.gubee.service.ProdutoService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
@Path("/produtos")
@Produces(MediaType.APPLICATION_JSON)
public class ProdutoResource {
    private ProdutoService produtoService;

    @GET
    public List<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }
}

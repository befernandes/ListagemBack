import com.gubee.model.Produto;
import com.gubee.service.ProdutoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProdutoServiceTest {
    private ProdutoService produtoService;

    @BeforeEach
    public void setUp() {
        produtoService = new ProdutoService();
    }

    @Test
    public void testListarProdutos() {
        // Cria alguns produtos fictícios para adicionar à lista de produtos
        Produto produto1 = new Produto(1,"nome1","descricao1","mercado1","tecnologia1");
        Produto produto2 = new Produto(2,"nome2","descricao2","mercado2","tecnologia2");
        Produto produto3 = new Produto(3,"nome3","descricao3","mercado3","tecnologia3");

        // Adiciona os produtos à lista de produtos do ProdutoService
        produtoService.criarProduto(produto1);
        produtoService.criarProduto(produto2);
        produtoService.criarProduto(produto3);

        // Chama o método listarProdutos() e obtém a lista de produtos
        List<Produto> produtos = produtoService.listarProdutos();

        // Verifica se a lista de produtos não é nula e possui o tamanho correto
        assertNotNull(produtos);
        assertEquals(3, produtos.size());

        // Verifica se os produtos adicionados estão presentes na lista de produtos
        assertEquals(produto1, produtos.get(0));
        assertEquals(produto2, produtos.get(1));
        assertEquals(produto3, produtos.get(2));
    }
}

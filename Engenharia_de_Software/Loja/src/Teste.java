import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		
		Loja loja = new Loja();
		
		assertEquals(loja.getprodutod().size(), 0);
		
		loja.cadastrarProduto(new Produto("A001", new Especificacao("Camisetas", "feminino", "P", "Branco")));
	
		assertEquals(loja.getprodutod().size(), 1);
		
		Produto produtoEncontrado = loja.buscarProdutoPorCodigo("A001");
		
		assertEquals(produtoEncontrado.getEspec().getTamanho(), "P");
		
		List<Produto> produtosEncontrados = loja.buscarProdutoPorEspecificacao(new Especificacao("Camisetas", "feminino", "P", "Branco"));
		
		assertEquals(produtosEncontrados.get(0).getEspec().getCategoria(), "Camisetas");
		
	}

}

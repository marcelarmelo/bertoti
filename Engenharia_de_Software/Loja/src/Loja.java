import java.util.LinkedList;
import java.util.List;

public class Loja {
	
	private List<Produto> produtos = new LinkedList<Produto>();
	
	public void cadastrarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public List<Produto> buscarProdutoPorEspecificacao(Especificacao espec){
		List<Produto> produtosEncontrados = new LinkedList<Produto>();
		for(Produto produto:produtos) {
			if(produto.getEspec().comparar(espec)) produtosEncontrados.add(produto);
		}
		
		return produtosEncontrados;
		
	}
	
	public Produto buscarProdutoPorCodigo (String codigoProduto) {
		for(Produto produto:produtos) {
			if(produto.getCodigoProduto().equals(codigoProduto)) {
				return produto;
			} 
		}
		return null;
	}
	
	//Método para apoiar nos testes
	public List<Produto> getprodutod(){
		return this.produtos;
	}
}


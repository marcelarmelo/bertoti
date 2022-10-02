public class Produto {
	
	//Atributos
	
	private String codigoProduto;
	private Especificacao espec;
	
	//Metodo construtor
	
	public Produto(String codigoProduto, Especificacao espec) {
		this.codigoProduto = codigoProduto;
		this.espec = espec;
	}
	
	
	
	public String getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public Especificacao getEspec() {
		return espec;
	}
	public void setEspec(Especificacao espec) {
		this.espec = espec;
	}
}

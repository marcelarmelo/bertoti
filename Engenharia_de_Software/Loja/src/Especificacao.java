public class Especificacao {
	
	//Atributos
	
	private String categoria;
	private String genero;
	private String tamanho;
	private String cor;
	
	//Metodo construtor
	
	public Especificacao(String categoria, String genero, String tamanho, String cor) {
		super();
		this.categoria = categoria;
		this.genero = genero;
		this.tamanho = tamanho;
		this.cor = cor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public boolean comparar ( Especificacao especificacao) {
		if(categoria.equals(especificacao.categoria) &&
				genero.equals(especificacao.genero) &&
				tamanho.equals(especificacao.tamanho) &&
				cor.equals(especificacao.cor)) {
			return true;
		} else {
			return false;
			}		
	}

}

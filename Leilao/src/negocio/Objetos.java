package negocio;

public class Objetos {
	private String descricao;
	private String descricaoCompleta;
	private String categoria;
	
	public Objetos(String descricao, String descricaoCompleta, String categoria) {
		this.descricao = descricao;
		this.descricaoCompleta = descricaoCompleta;
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricaoCompleta() {
		return descricaoCompleta;
	}

	public void setDescricaoCompleta(String descricaoCompleta) {
		this.descricaoCompleta = descricaoCompleta;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}

package negocio;

import java.util.ArrayList;

public class Leilao {
	private ArrayList<Usuario> usuarios;
	private ArrayList<Objetos> lote;
	private Usuario vendedor;
	private boolean status;

	public Leilao(ArrayList<Objetos> lote, Usuario vendedor) {
		this.lote = lote;
		this.vendedor = vendedor;
	}
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public ArrayList<Objetos> getLote() {
		return lote;
	}

	public Usuario getVendedor() {
		return vendedor;
	}

	public boolean getStatus() {
		return status;
	}
}
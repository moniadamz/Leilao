/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import dados.DAOException;
import dados.DAO;

import java.util.ArrayList;
import java.util.List;

public class CadastroFachada {
	private CadastroDAO dao;
	private List<CadastroListener> listeners;

	public CadastroFachada() throws CadastroException {
		try {
			dao = DAO.getInstance();
			listeners = new ArrayList<CadastroListener>();
		} catch (DAOException e) {
			throw new CadastroException("Falha de criação da fachada!", e);
		}
	}

	public void addCadastroListener(CadastroListener l) {
		if (!listeners.contains(l)) {
			listeners.add(l);
		}
	}

	public void removeCadastroListener(CadastroListener l) {
		listeners.remove(l);
	}

	protected void fireElementoAdicionado(Pessoa p) {
		CadastroEvent evt = new CadastroEvent(this, p);
		for (CadastroListener l : listeners) {
			l.elementoAdicionado(evt);
		}
	}

	public Usuario adicionarUsuario(String nome, String cpf_cnpj, String email) throws CadastroException {
		Usuario usuario = new Usuario(nome, cpf_cnpj, email);
		try {
			boolean ok = dao.adicionarUsuario(usuario);
			if (ok) {
				fireElementoAdicionado(p);
				return p;
			}
			return null;
		} catch (DAOException e) {
			throw new CadastroException("Falha ao adicionar pessoa!", e);
		}
	}

	public boolean adicionarLeilao(ArrayList<Objetos> lote, Usuario vendedor) throws CadastroException{
			Leilao leilao = new Leilao(lote, vendedor);
			try {
				boolean ok = dao.adicionarLeilao(lote, vendedor);
				if (ok) {
					fireElementoAdicionado(p);
					return p;
				}
				return null;
			} catch (DAOException e) {
				throw new CadastroException("Falha ao adicionar leilão!", e);
			}
		}

	boolean adicionarObjeto(String descricao, String descricaoCompleta, String categoria) throws DAOException{
		Objetos lote = new Objetos(descricao, descricaoCompleta, categoria);
		try {
			boolean ok = dao.adicionarObjeto(descricao, descricaoCompleta, categoria);
			if (ok) {
				fireElementoAdicionado(p);
				return p;
			}
			return null;
		} catch (DAOException e) {
			throw new CadastroException("Falha ao adicionar objeto!", e);
		}
	}
}


	public List<Objetos> getObjetos() throws CadastroException {
		try {
			return dao.getObjetos();
		} catch (DAOException e) {
			throw new CadastroException("Falha ao buscar objetos!", e);
		}
	}


	public List<Usuario> getUsuarios() throws CadastroException {
		try {
			return dao.getUsuarios();
		} catch (DAOException e) {
			throw new CadastroException("Falha ao buscar usuarios!", e);
		}
	}

	public Leilao getLeilao() throws CadastroException {
		try {
			return dao.getLeilao();
		} catch (DAOException e) {
			throw new CadastroException("Falha ao buscar leilao!", e);
		}
	}

}

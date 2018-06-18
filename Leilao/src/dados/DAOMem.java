/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import negocio.CadastroDAO;
import negocio.Leilao;
import negocio.Objetos;

import java.util.ArrayList;
import java.util.List;
import negocio.Usuario;


public class DAOMem implements CadastroDAO {
    private List<Usuario> usuarios;
    private List<Objetos> lote;
    
    public DAOMem() {
        usuarios = new ArrayList<Usuario>();
        lote = new ArrayList<Objetos>();
    }
    
    public Leilao getLeilao() throws DAOException {
		return null;
	}
    
    @Override
    public boolean adicionarUsuario(Usuario usuario) {
        return usuarios.add(usuario);
    }

    @Override
	public boolean adicionarObjeto(Objetos objeto) {
    	return lote.add(objeto);
    }

    @Override
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    @Override
    public List<Objetos> getObjetos() {
    	return lote;
    }

	@Override
	public boolean adicionarLeilao(ArrayList<Objetos> objetos, Usuario vendedor) throws DAOException {
		// TODO Auto-generated method stub
		return false;
	}
}

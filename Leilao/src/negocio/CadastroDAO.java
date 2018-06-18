/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dados.DAOException;

import java.util.ArrayList;
import java.util.List;

public interface CadastroDAO {
    boolean adicionarUsuario(Usuario usuario) throws DAOException;
    boolean adicionarLeilao(ArrayList<Objetos> objetos, Usuario vendedor) throws DAOException;
    boolean adicionarObjeto(Objetos objeto) throws DAOException;
    Leilao getLeilao() throws DAOException;
    List<Usuario> getUsuarios() throws DAOException;
    List<Objetos> getObjetos() throws DAOException;
    
}

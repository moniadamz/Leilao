package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import negocio.CadastroDAO;
import negocio.Leilao;
import negocio.Objetos;
import negocio.Usuario;


public class DAO implements CadastroDAO {
    private static DAO ref;
    
    public static DAO getInstance() throws DAOException {
        if (ref == null)
            ref = new DAO();
        return ref;
    }
    
    private DAO() throws DAOException {
        try {
             Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch (ClassNotFoundException ex) {
            throw new DAOException("JdbcOdbDriver not found!!");
        }
        // Cria o banco de dados vazio
        // Retirar do comentario se necessário
        /*
        try {
            createDB();
        } catch (Exception ex) {
            System.out.println("Problemas para criar o banco: "+ ex.getMessage());
            System.exit(0);
        }
        */
    }
    
    private static void createDB() throws DAOException {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby:derbyDB;create=true");
            Statement sta = con.createStatement();
            String sql = "CREATE TABLE Usuario ("
                    + "ID INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                    + "NOME VARCHAR(100) NOT NULL,"
                    + "CPF_CNPJ VARCHAR(13) NOT NULL,"
                    + "EMAIL VARCHAR(100) NOT NULL"
                    + ")"
                    + ""
                    + "CREATE TABLE Objetos ("
                    + "ID INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                    + "DESCRICAO VARCHAR(100) NOT NULL,"
                    + "DESCRICAO_COMPLETA VARCHAR(100) NOT NULL,"
                    + "CATEGORIA VARCHAR(100) NOT NULL,"
                    + ")"
                    ;
            sta.executeUpdate(sql);
            sta.close();
            con.close();
        } catch (SQLException ex) {
            throw new DAOException(ex.getMessage());
        }
    }
    
    private static Connection getConnection() throws SQLException {
        //derbyDB sera o nome do diretorio criado localmente
        return DriverManager.getConnection("jdbc:derby:derbyDB");
    }

	@Override
	public boolean adicionarUsuario(Usuario usuario) throws DAOException {
		 try {
	            Connection con = getConnection();
	            PreparedStatement stmt = con.prepareStatement(
	                    "INSERT INTO USUARIO (NOME, CPF_CNPJ, EMAIL) VALUES (?,?,?)"
	                    );
	            stmt.setString(1, usuario.getNome());
	            stmt.setString(2, usuario.getCpf_cnpj());
	            stmt.setString(3, usuario.getEmail());
	            int ret = stmt.executeUpdate();
	            con.close();
	            return (ret>0);
	        } catch (SQLException ex) {
	            throw new DAOException("Falha ao adicionar.", ex);
	        }
	}

	@Override
	public boolean adicionarLeilao(ArrayList<Objetos> objetos, Usuario vendedor) throws DAOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean adicionarObjeto(Objetos objeto) throws DAOException {
		try {
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(
                    "INSERT INTO OBJETOS (DESCRICAO, DESCRICAO_COMPLETA, CATEGORIA) VALUES (?,?,?)"
                    );
            stmt.setString(1, objeto.getDescricao());
            stmt.setString(2, objeto.getDescricaoCompleta());
            stmt.setString(3, objeto.getCategoria());
            int ret = stmt.executeUpdate();
            con.close();
            return (ret>0);
        } catch (SQLException ex) {
            throw new DAOException("Falha ao adicionar.", ex);
        }
	}

	@Override
	public Leilao getLeilao() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> getUsuarios() throws DAOException {
		try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM USUARIO");
            List<Usuario> lista = new ArrayList<Usuario>();
            while(resultado.next()) {
                String nome = resultado.getString("NOME");
                String cpf_cpnj = resultado.getString("CPF_CNPJ");
                String email = resultado.getString("EMAIL");
                Usuario usuario = new Usuario(nome, cpf_cpnj, email);
                lista.add(usuario);
            }
            return lista;
        } catch (SQLException ex) {
            throw new DAOException("Falha ao buscar.", ex);
        }
	}

	@Override
	public List<Objetos> getObjetos() throws DAOException {
		try {
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM OBJETOS");
            List<Objetos> lista = new ArrayList<Objetos>();
            while(resultado.next()) {
                String descricao = resultado.getString("DESCRICAO");
                String descricao_completa= resultado.getString("DESCRICAO_COMPLETA");
                String categoria = resultado.getString("CATEGORIA");
                Objetos objeto = new Objetos(descricao, descricao_completa, categoria);
                lista.add(objeto);
            }
            return lista;
        } catch (SQLException ex) {
            throw new DAOException("Falha ao buscar.", ex);
        }
	}
}    

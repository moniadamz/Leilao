package negocio;

public class Usuario {
	 private String nome;
	 private String cpf_cnpj;
	 private String email;
	 
	 public Usuario(String nome, String cpf_cnpj, String email) {
		 this.nome = nome;
		 this.cpf_cnpj = cpf_cnpj;
		 this.email = email;
	 }

	public String getNome() {
		return nome;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	 
	 
}

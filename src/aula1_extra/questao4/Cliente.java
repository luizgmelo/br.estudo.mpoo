package aula1_extra.questao4;

public class Cliente {
	private final String SENHA_DEFAULT = "123456";
	
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String senha;
	
	public Cliente(String nome, String cpf, String telefone, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.senha = SENHA_DEFAULT;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email + ", senha="
				+ senha + "]";
	}
}

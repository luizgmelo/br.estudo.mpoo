package aula1_extra.questao4;

public class Funcionario {
	private final String SENHA_DEFAULT = "123456";
	
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private double salario;
	private String matricula;
	private String senha;
	
	public Funcionario(String nome, String cpf, String telefone, String email, double salario, String matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.salario = salario;
		this.matricula = matricula;
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

	public double getSalario() {
		return salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email
				+ ", salario=" + salario + ", matricula=" + matricula + ", senha=" + senha + "]";
	}
}

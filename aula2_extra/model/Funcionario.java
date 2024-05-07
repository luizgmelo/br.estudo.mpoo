package model;

public class Funcionario extends UsuarioAbstract {
	private String matricula;
	private double salario;
	
	public Funcionario(String nome, String cpf, String telefone, String email, String senha, String matricula,
			double salario) {
		super(nome, cpf, telefone, email, senha);
		this.matricula = matricula;
		this.salario = salario;
	}

	public Funcionario(String nome, String cpf, String telefone, String email, String matricula, double salario) {
		super(nome, cpf, telefone, email);
		this.matricula = matricula;
		this.salario = salario;
	}

	public Funcionario(String nome, String cpf, String telefone, String email, String senha, String matricula) {
		super(nome, cpf, telefone, email, senha);
		this.matricula = matricula;
		// salario=0.0
	}

	public Funcionario(String nome, String cpf, String telefone, String email, String matricula) {
		super(nome, cpf, telefone, email);
		this.matricula = matricula;
		// salario=0.0 e senha 123456
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
}

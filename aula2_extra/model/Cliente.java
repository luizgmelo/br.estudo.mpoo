package model;

public class Cliente extends UsuarioAbstract {
	private boolean isReceivePropaganda;

	public Cliente(String nome, String cpf, String telefone, String email, String senha, boolean isReceivePropaganda) {
		super(nome, cpf, telefone, email, senha);
		this.isReceivePropaganda = isReceivePropaganda;
	}

	public Cliente(String nome, String cpf, String telefone, String email, boolean isReceivePropaganda) {
		super(nome, cpf, telefone, email);
		this.isReceivePropaganda = isReceivePropaganda;
	}	
}

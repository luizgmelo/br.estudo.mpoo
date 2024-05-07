package model;

import java.util.ArrayList;

public class BaseDados {
	static private ArrayList<UsuarioAbstract> usuarios;
	
	public static void createBase() {
		usuarios = new ArrayList<UsuarioAbstract>();
		inicializarBase();
	}
	
	public static void inicializarBase() {
		adicionarUsuario(new Funcionario("João", "478.676.830-89", "1234-1234", "joao@email.com", "FUNC001"));
		adicionarUsuario(new Funcionario("Godofredo", "159.853.310-08", "4321-1234", "godao@email.com", "FUNC002"));
		
		adicionarUsuario(new Cliente("ChicoBola", "191.843.580-41", "4321-4321", "chicobola@email.com", true));
		adicionarUsuario(new Cliente("Josefina", "922.799.410-66", "2341-2341", "josefina@email.com", false));
	}

	private static UsuarioAbstract buscarUsuario(String cpf) {
		for (UsuarioAbstract usuarioAbstractCurrent : usuarios) {
			if (usuarioAbstractCurrent.getCpf().equals(cpf)) {
				return usuarioAbstractCurrent;
			}
		}
		return null;
	}
	
	private static UsuarioAbstract buscarUsuario(UsuarioAbstract usuario) {
		return buscarUsuario(usuario.getCpf());
	}
	
	public static boolean isCliente(UsuarioAbstract usuario) {
		return usuarios.contains(buscarUsuario(usuario.getCpf()));
	}
	
	public static boolean isUsuario(String login, String senha) {
		if (login!=null && senha!=null)
			for (UsuarioAbstract usuarioAbstractCurrent : usuarios) {
				if (usuarioAbstractCurrent.getEmail().equalsIgnoreCase(login)
						&& usuarioAbstractCurrent.getSenha().equals(senha))
					return true;
			}
		return false;
	}
	
	public static boolean adicionarUsuario(UsuarioAbstract usuario) {
		if (usuario != null)
			if (usuarios != null && usuarios.size() >= 0)
				if (ValidadorCPF.validarCPF(usuario.getCpf()))
					if (!isCliente(usuario))
						return usuarios.add(usuario);
		return false;
	}
}

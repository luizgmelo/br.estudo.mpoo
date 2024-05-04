package aula1_extra;

import java.util.ArrayList;
import java.util.Arrays;

public class BaseDados {
	static private ArrayList<Usuario> usuarios;

	public static void createBase() {
		usuarios = new ArrayList<Usuario>();
		inicializarBase();
	}

	public static void inicializarBase() {
		adicionarCliente(new Usuario("José Santos", "941.860.760-30", "josesantos@gmail.com", "jose123",
				new ArrayList<Telefone>(Arrays.asList(new Telefone(55, 81, 999990000))),
				new Endereco("Av. dos Cactos", 100, "Cactolândia", 56970000, "Serra Talhada", "PE", null)));
		
		adicionarCliente(new Usuario("Maria Silva", "575.373.110.48-30", "mariasilva@gmail.com", "mariamaria",
				new ArrayList<Telefone>(Arrays.asList(new Telefone(55, 81, 999990001))),
				new Endereco("Rua Flores", 50, "Encruzilhada", 52041430, "Recife", "PE", null)));
		
		adicionarCliente(new Usuario("João Mamão", "080.075.880-35", "jmamao@gmail.com", "mamãoDocE",
				new ArrayList<Telefone>(Arrays.asList(new Telefone(55, 87, 999990002), new Telefone(55, 87, 999990003))),
				new Endereco("Rua Mamão Doce", 100, "Saudade", 56870000, "Triunfo", "PE", null)));
	}

	public static Usuario buscarCliente(Usuario cliente) {
		// RN01 - um usuário é identificado pelo seu cpf;
		for (Usuario usuarioCurrent : usuarios) {
			if (usuarioCurrent.getCpf() == cliente.getCpf()) {
				return usuarioCurrent;
			}
		}
		return null;
	}

	public static Usuario buscarCliente(String cpf) {
		// RN04 – a codificação deve aproveitar comportamentos já definidos, evitando a
		// duplicidade de programação;
		return buscarCliente(new Usuario(null, cpf, null, null, null, null));
	}

	public static boolean isCliente(Usuario cliente) {
		return usuarios.contains(buscarCliente(cliente));
	}

	public static boolean adicionarCliente(Usuario cliente) {
		// validar cpf
		if (!ValidadorCPF.validarCPF(cliente.getCpf())) {
			return false;
		}
		// RN03 – um usuário só poderá ser cadastrado uma única vez;
		if (!isCliente(cliente)) {
			return usuarios.add(cliente);
		}
		return false;
	}

	public static boolean removerCliente(Usuario cliente) {
		return usuarios.remove(buscarCliente(cliente));
	}

	public static boolean atualizarCliente(Usuario clienteOld, Usuario clienteNew) {
		if (usuarios != null && usuarios.size() > 0) {
			Usuario status = usuarios.set(usuarios.indexOf(buscarCliente(clienteOld)), clienteNew);
			if (status != null)
				return true;
			return false;
		}
		return false;
	}

}

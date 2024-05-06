package aula1_extra.questao4;

import java.util.ArrayList;

public class BaseDadosCliente {
	private static ArrayList<Cliente> clientes;
	
	public static void createBase() {
		clientes = new ArrayList<Cliente>();
		inicializarBase();
	}
	
	public static void inicializarBase() { 
		adicionarCliente(new Cliente("José Santos", "941.860.760-30", "(81) 99999-0000", "josesantos@gmail.com"));
		adicionarCliente(new Cliente("Maria Silva", "575.373.110-4830", "(82) 99999-0001", "mariasilva@gmail.com"));
		adicionarCliente(new Cliente("João Mamão", "080.075.880-35", "(87) 99999-0002", "jmamao@gmail.com"));
	}

	public static Cliente buscarCliente(Cliente cliente) {
		for (Cliente clienteCurrent : clientes) {
			if (cliente.getCpf().equalsIgnoreCase(clienteCurrent.getCpf())) {
				return clienteCurrent;
			}
		}
		return null;
	}
	
	public static Cliente buscarCliente(String cpf) {
		return buscarCliente(new Cliente(null, cpf, null, null));
	}
	
	public static boolean isCliente(Cliente cliente) {
		return clientes.contains(buscarCliente(cliente));
	}
	
	public static boolean adicionarCliente(Cliente cliente) {
		if (!isCliente(cliente)) {
			return clientes.add(cliente);
		}
		return false;
	}
	
	public static boolean removerCliente(Cliente cliente) {
		return clientes.remove(buscarCliente(cliente));
	}
	
	public static boolean atualizarCliente(Cliente clienteOld, Cliente clienteNew) {
		// verificar se a lista existe
		if (clientes != null && clientes.size() > 0) {
			// usar o método de arraylist set para atualizar os dados
														  // verificar se o cliente está na base
			boolean status = clientes.set(clientes.indexOf(buscarCliente(clienteOld)), clienteNew) != null;
			if (status) {
				return true;
			}
		}
		return false;		
	}
}

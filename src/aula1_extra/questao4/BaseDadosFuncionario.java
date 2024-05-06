package aula1_extra.questao4;

import java.util.ArrayList;

public class BaseDadosFuncionario {
	private static ArrayList<Funcionario> funcionarios;

	public static void createBase() {
		funcionarios = new ArrayList<Funcionario>();
		inicializarBase();
	}

	public static void inicializarBase() {
		adicionarFuncionario(new Funcionario("Severino de Jesus", "064.749.190-78", "(81) 99999-1111",
				"sevjesus@gmail.com", 150000, "func001"));
		adicionarFuncionario(new Funcionario("Maria Silva", "575.373.110-4830", "(82) 99999-0001",
				"mariasilva@gmail.com", 150000, "func002"));
		adicionarFuncionario(new Funcionario("José Santos", "941.860.760-30", "(81) 99999-0000", "josesantos@gmail.com",
				300000, "func001"));
	}

	public static Funcionario buscarFuncionario(Funcionario Funcionario) {
		for (Funcionario FuncionarioCurrent : funcionarios) {
			if (Funcionario.getCpf().equalsIgnoreCase(FuncionarioCurrent.getCpf())) {
				return FuncionarioCurrent;
			}
		}
		return null;
	}

	public static Funcionario buscarFuncionario(String cpf) {
		return buscarFuncionario(new Funcionario(null, cpf, null, null, 0, null));
	}

	public static boolean isFuncionario(Funcionario Funcionario) {
		return funcionarios.contains(buscarFuncionario(Funcionario));
	}

	public static boolean adicionarFuncionario(Funcionario Funcionario) {
		if (!isFuncionario(Funcionario)) {
			return funcionarios.add(Funcionario);
		}
		return false;
	}

	public static boolean removerFuncionario(Funcionario Funcionario) {
		return funcionarios.remove(buscarFuncionario(Funcionario));
	}

	public static boolean atualizarFuncionario(Funcionario FuncionarioOld, Funcionario FuncionarioNew) {
		// verificar se a lista existe
		if (funcionarios != null && funcionarios.size() > 0) {
			// usar o método de arraylist set para atualizar os dados
			// verificar se o Funcionario está na base
			boolean status = funcionarios.set(funcionarios.indexOf(buscarFuncionario(FuncionarioOld)),
					FuncionarioNew) != null;
			if (status) {
				return true;
			}
		}
		return false;
	}
}

package aula1_extra.questao4;

public class App {
	public static void main(String[] args) {
		BaseDadosCliente.createBase();
		BaseDadosFuncionario.createBase();
		
		System.out.println(BaseDadosCliente.buscarCliente("941.860.760-30").toString());
		System.out.println(BaseDadosCliente.buscarCliente("575.373.110-4830").toString());
		System.out.println(BaseDadosCliente.buscarCliente("080.075.880-35").toString());

		System.out.println(BaseDadosFuncionario.buscarFuncionario("064.749.190-78").toString());
		System.out.println(BaseDadosFuncionario.buscarFuncionario("575.373.110-4830").toString());
		System.out.println(BaseDadosFuncionario.buscarFuncionario("941.860.760-30").toString());
	
	}
}

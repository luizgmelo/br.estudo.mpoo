package aula1_extra;

import java.util.ArrayList;

public class BaseDados {
	static private ArrayList<Usuario> usuarios;
	
	public void createBase() {
		usuarios =  new ArrayList<Usuario>();
//		inicializarBase();
	}
	
//	public void inicializarBase() {
//		adicionarUsuario(new Usuario(null, null, null, null, null, null));
//	}
	
	public Usuario buscarCliente(Usuario cliente) {
		// RN01 - um usuário é identificado pelo seu cpf;
		for (Usuario usuarioCurrent : usuarios) {
			if (usuarioCurrent.getCpf() == cliente.getCpf()) {
				return usuarioCurrent;
			}
		}
		return null;
	}
	
   public Usuario buscarCliente(String cpf) {
	   // RN04 – a codificação deve aproveitar comportamentos já definidos, evitando a duplicidade de programação;
	   return buscarCliente(new Usuario(null, cpf, null, null, null, null));
   }
   
   public boolean isCliente(Usuario cliente) {
	   return usuarios.contains(buscarCliente(cliente));
   }

	
	
	
	

}

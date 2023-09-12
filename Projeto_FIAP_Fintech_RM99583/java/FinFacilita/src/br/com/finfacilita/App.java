package br.com.finfacilita;

public class App {
	
	//CLASSE APP
	
	//MÉTODO MAIN

	public static void main(String[] args) {
			
		/**
		 * INSTANCIA OBJETOS
		 * CADASTRA USUARIOS
		 * ALTERA SENHA DO USUARIO
		 * E EXCLUI USUARIOS COM VALIDAÇÃO DA SENHA DO OBJETO EM REFERÊNCIA
		 */
			
		//INSTANCIANDO UM OBJETO USUARIO
		
		Usuario usuario1 = new Usuario();
		usuario1.cadastrarUsuario(321456789, "rodrigo@gmail.com", "Rodrigo", "password123");

		System.out.println("---CADASTRO DE USUARIO---");
		System.out.println("");
		System.out.println(usuario1.getCpf());
		System.out.println(usuario1.geteMail());
		System.out.println(usuario1.getNomeUsuario());
		System.out.println(usuario1.getSenha());

		System.out.println("");
		System.out.println("");

		
		Usuario usuario2 = new Usuario(123456789, "notrodrigo@gmail.com", "notRodrigo", "password321");
		System.out.println("---CADASTRO DE USUARIO---");
		System.out.println("");
		System.out.println(usuario2.getCpf());
		System.out.println(usuario2.geteMail());
		System.out.println(usuario2.getNomeUsuario());
		System.out.println(usuario2.getSenha());

		System.out.println("");
		System.out.println("");
		
		System.out.println("---ALTERACAO DE SENHA---");
		System.out.println("");
		usuario2.mudarSenha("password321", "newpassword123");
		System.out.println(usuario2.getCpf());
		System.out.println(usuario2.geteMail());
		System.out.println(usuario2.getNomeUsuario());
		System.out.println(usuario2.getSenha());

		System.out.println("");
		System.out.println("");
		

		System.out.println("---EXCLUSAO DE USUARIO---");
		System.out.println("");
		usuario1.excluirUsuario("password123");
		System.out.println("---EXCLUSAO DE USUARIO---");
		System.out.println("");
		usuario2.excluirUsuario("password321");
		
	}

}

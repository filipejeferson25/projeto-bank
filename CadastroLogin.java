package ContaUsuario;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroLogin extends Pessoa{
	
	String permitido;
	String confirmarCpf;
	String confirmarSenha;
	int tentarSenha = 0;
	
	static ArrayList<Pessoa> cadastro = new ArrayList<>();
	static CadastroLogin cadastrologin = new CadastroLogin();

	static Scanner input = new Scanner(System.in);

			public void Cadastro() {				
				
				System.out.println("Nome Completo: ");
				cadastrologin.setNome(input.nextLine());
				System.out.println("Seu CPF: ");
				cadastrologin.setCpf(input.nextLine());
				System.out.println("Defina uma senha: ");
				cadastrologin.setSenha(input.nextLine());
				
				System.out.println("  --------   CADASTRO REALIZADO COM SUCESSO   --------");
				cadastro.add(cadastrologin);	
				
				
		

			}
			
				public boolean loginAutorizado(){
				boolean permitido = true;
				
				
					
						System.out.println("\nInforme o seu CPF: ");
						confirmarCpf = input.nextLine();
						System.out.println("\nInforme a sua senha: ");
						confirmarSenha = input.nextLine();
						
						if(((confirmarCpf.contains((cadastrologin.getCpf())) && ((confirmarSenha.contains(cadastrologin.getSenha())))))) {
							System.out.println("\n    -------------   ACESSO AUTORIZADO   -------------\n\n");
							return permitido;
						}else {
							System.out.println("\n    -------------   ACESSO NEGADO   -------------\n\n"
									+ "	 	\n 		DADOS NÃO CONFEREM. TENTE NOVAMENTE.\n"
									+ "\nDigite 0 para tentar novamente ou 1 para sair.");
							tentarSenha = Integer.parseInt(input.nextLine());
						}return !permitido;
				
				}
				
				
				public void Listar() {
					
					if(cadastro.isEmpty()) {
						System.out.println("  ---  NENHUM USUÁRIO CADASTRADO  ---\n");
					}else {
						System.out.println("\n   ------------   LISTA CADASTRADA   -------------\n");
						cadastro.forEach(lista -> System.out.print("Nome: \n" + cadastrologin.getNome()
						+ "\nCPF: " + cadastrologin.getCpf()));
						
					}
				}
}

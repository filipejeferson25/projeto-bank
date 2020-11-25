package ContaCorrente;

import java.util.ArrayList;
import java.util.Scanner;
import ContaCorrente.SistemaBancario;

import ContaUsuario.CadastroLogin;
import ContaUsuario.Pessoa;

public class ContaTeste {

	public static final boolean permitido = true;

	public static void main(String[] args) {
		int saldoBloqueado = 0;
		int opcaoMenu = 0;
		int retornar = 0;
		int retornarAcesso = 0;
		int escolha = 0;
		int menuPrincipal  = 0;	
		int tentarSenha = 0;
		boolean acessoPermitido = true;
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	
		
			ArrayList<Pessoa> pessoaAcesso = new ArrayList<>();	
			ArrayList<ContaCorrente> contaBancaria = new ArrayList<>();
			
			ContaCorrente conta = new ContaCorrente();
			ContaCorrente cont = new ContaCorrente();	
			SistemaBancario con = new SistemaBancario();
		    CadastroLogin cadastroPessoa = new CadastroLogin();		
		
			Apresentacao apresentacao = new Apresentacao();
			CadastroLogin cadastrologin = new CadastroLogin();
			
			
			
		
		
			//APRESENTAÇÃO DO LOGO DO BANCO.	
			apresentacao.Apresentacao();
		
			do {
			//MENU DE OPÇÕES DE SERVIÇOS.
			System.out.println("\n				 ACESSE SUA CONTA!"
					+ "\n			 OU ABRA SUA CONTA AGORA MESMO!\n\n"
					+ "				1 - ACESSAR CONTA\n"
					+ "				2 - ABRIR CONTA\n"
					+ "				3 - LISTAR NOMES CADASTRADOS\n"
					+ "				4 - PESQUISAR NOME NA LISTA\n"
					+ "				5 - EXCLUIR NOME DA LISTA\n"
					+ "				6 - SAIR DA CONTA\n"
					+ "\nInforme sua opção:");
				escolha = Integer.parseInt(input.nextLine());
				
				
				
				switch(escolha) {	
						case 1:
							
							//ACESSO A CONTA DEPOIS DE TER CADASTRO...
							cadastrologin.loginAutorizado();
							if(cadastrologin.loginAutorizado() == permitido) {
							con.sistemaBancario();
							}else {
								do {
								if(cadastrologin.loginAutorizado() != permitido) {
									System.out.println("\nDigite 0 para tentar novamente ou 1 para sair.");
									tentarSenha = Integer.parseInt(input.nextLine());
								}
							}while(tentarSenha == 0);
							}
							break;							
				
								case 2: {
									
									cadastroPessoa.Cadastro();
										System.out.println("\nretornar ao menu principal digite 0, se não 1 para encerrar.");
										menuPrincipal = Integer.parseInt(input.nextLine());	
									break;
									}
										case 3:
											cadastroPessoa.Listar();
												System.out.println("\nretornar ao menu principal digite 0, se não 1 para encerrar.");
												menuPrincipal = Integer.parseInt(input.nextLine());
										break;
							
											case 4:
											
													System.out.println("\nretornar ao menu principal digite 0, se não 1 para encerrar.");
													menuPrincipal = Integer.parseInt(input.nextLine());	
												break;							
					
													case 5: {
														
														
															System.out.println("\nretornar ao menu principal digite 0, se não 1 para encerrar.");
															menuPrincipal = Integer.parseInt(input.nextLine());	
														break;
														}
															case 6:
																
																	System.out.println("\nretornar ao menu principal digite 0, se não 1 para encerrar.");
																	menuPrincipal = Integer.parseInt(input.nextLine());
															break;
							
							
																default:
																	System.out.println("\n ---   OPÇÃO INVÁLIDA  ---\n");
																}			
		
								}while(menuPrincipal == 0);
								System.out.println("\n  -----     OPERAÇÃO FINALIZADA!     -----");
						}
}
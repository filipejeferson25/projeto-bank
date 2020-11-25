package ContaCorrente;

import java.util.ArrayList;
import java.util.Scanner;


public class SistemaBancario {
	
	int saldoAtualizado = 0;
	int saldoBloqueado = 0;
	int deposito;
	int retirada;
	int opcaoMenu = 0;
	int retornar = 0;
	int retornarAcesso = 0;
	int escolha = 0;
	int menuPrincipal  = 0;
	double saldo = 0;
	
	

	
	
	public void sistemaBancario() {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);	
		
		ArrayList<ContaCorrente> contaBancaria = new ArrayList<>();
		SistemaBancario cont = new SistemaBancario();
		ContaCorrente conta = new ContaCorrente();
		
	do {
		
		
		System.out.printf("\n 		  -------  SERVIÇOS BANCÁRIOS  --------\n\n"
				+ "			1 - SALDO\n"
				+ "			2 - DEPOSITAR\n"
				+ "			3 - SAQUE\n"
				+ "			4 - EXTRATO\n"
				+ "			5 - SAIR\n"				
				+ "Informe a sua opção:\n");				 
		opcaoMenu = input.nextInt();		
		
		switch (opcaoMenu) {
		    
			case 1:
					System.out.printf("   ------------   CONTA CORRENTE - SALDO   --------------\n");
					if(cont.saldo == 0) 
					System.out.printf("\nSALDO......................R$ %.2f", cont.saldoAtualizado);
					contaBancaria.add(conta);				
					System.out.printf("\nRetornar ao menu digite 0, se não 1 para encerrar.");
					retornar = input.nextInt();					
					break;			
				
					
			case 2:
						System.out.printf("   ------------   CONTA CORRENTE - DEPÓSITO   --------------\n");
						conta.deposito();
						contaBancaria.add(conta);					
						System.out.printf("\nRetornar ao menu digite 0, se não 1 para encerrar.");
						retornar = input.nextInt();					
						break;
				
						
			case 3:
							System.out.printf("   ------------   CONTA CORRENTE - SAQUE   --------------\n");
							conta.retirada();
							contaBancaria.add(conta);						
							System.out.printf("\nRetornar ao menu digite 0, se não 1 para encerrar.");
							retornar = input.nextInt();						
							break;	
							
								
						
					case 4:
							System.out.printf("   ------------   CONTA CORRENTE - EXTRATO   --------------\n");
							conta.extrato();
							contaBancaria.add(conta);					
							System.out.printf("\nRetornar ao menu digite 0, se não 1 para encerrar.");
							retornar = input.nextInt();						
							break;	
		

									default:
									System.out.printf("\n 		*****     Opção Inválida:     *****\n");
									break;
		

						}
			}while(retornar == 0);
		}

}

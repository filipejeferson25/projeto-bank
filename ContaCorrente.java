package ContaCorrente;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ContaCorrente {
	double saldoBloqueado = 0;
	double saldoAtualizado;
	double valor;
	double saldo;
	double deposito;
	double retirada;
	int numConta;
	int r = 0;
	int d = 0;
	int contador = 0;
	int contador1 = 0;
	Scanner input = new Scanner(System.in);

	
	
				Deque<Double> ext = new ArrayDeque<Double>();
	

				void deposito() {
				System.out.printf("VALOR DE DEPÓSITO: ");
				ext.addFirst(deposito = input.nextDouble());	
			
				saldoAtualizado = deposito + saldoAtualizado;	
				System.out.printf("\nDEPÓSITO...................R$ %.2f\n"
						+ "SALDO......................R$ %.2f" , deposito , saldoAtualizado);
				}	
	
	
						 void retirada() {			
						 System.out.printf("\nVALOR DE SAQUE: ");
						 ext.addFirst(retirada = input.nextDouble());
						 contador++;
							
						 if(retirada > saldoAtualizado) {
						 System.out.printf("		Saldo é insuficiente!\n"
						 		+ "Faça um deposito para começar a usar sua conta.\n");
					 	 }else if(retirada <= saldoAtualizado) {
						 System.out.printf("SALDO......................R$ %.2f\n"
						 		+ "SAQUE.....................-R$ %.2f", saldoAtualizado, retirada);	
						 saldoAtualizado -= retirada;		 
						 System.out.printf("\nSALDO DISPONÍVEL...........R$ %.2f", saldoAtualizado);
					 	 }
						 }
							
				 
				 
								 void extrato() {
									 System.out.printf("  ---------------   EXTRATO BANCÁRIO   --------------\n\n"
							 			+ "SALDO......................R$ %.2f\n"
										+ "SALDO BLOQUEADO............R$ %.2f\n"
										+ "SALDO DISPONÍVEL...........R$ %.2f\n\n"
										+ "", saldoAtualizado, saldoBloqueado, saldoAtualizado);
							
							
							 						 
									 	for(double list: ext) {
											 System.out.printf("\nSAQUE.....................-R$ %.2f", list);
											 System.out.printf("\nDEPÓSITO...................R$ %.2f", list);
									 }
									}
						  
//							
										 public double getSaldo() {						 
											return saldoAtualizado = deposito +(-retirada);
										}


												public int getNumConta() {
													
													return getNumConta();
												}


	

}

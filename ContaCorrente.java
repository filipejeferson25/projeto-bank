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
				System.out.printf("VALOR DE DEP�SITO: ");
				ext.addFirst(deposito = input.nextDouble());	
			
				saldoAtualizado = deposito + saldoAtualizado;	
				System.out.printf("\nDEP�SITO...................R$ %.2f\n"
						+ "SALDO......................R$ %.2f" , deposito , saldoAtualizado);
				}	
	
	
						 void retirada() {			
						 System.out.printf("\nVALOR DE SAQUE: ");
						 ext.addFirst(retirada = input.nextDouble());
						 contador++;
							
						 if(retirada > saldoAtualizado) {
						 System.out.printf("		Saldo � insuficiente!\n"
						 		+ "Fa�a um deposito para come�ar a usar sua conta.\n");
					 	 }else if(retirada <= saldoAtualizado) {
						 System.out.printf("SALDO......................R$ %.2f\n"
						 		+ "SAQUE.....................-R$ %.2f", saldoAtualizado, retirada);	
						 saldoAtualizado -= retirada;		 
						 System.out.printf("\nSALDO DISPON�VEL...........R$ %.2f", saldoAtualizado);
					 	 }
						 }
							
				 
				 
								 void extrato() {
									 System.out.printf("  ---------------   EXTRATO BANC�RIO   --------------\n\n"
							 			+ "SALDO......................R$ %.2f\n"
										+ "SALDO BLOQUEADO............R$ %.2f\n"
										+ "SALDO DISPON�VEL...........R$ %.2f\n\n"
										+ "", saldoAtualizado, saldoBloqueado, saldoAtualizado);
							
							
							 						 
									 	for(double list: ext) {
											 System.out.printf("\nSAQUE.....................-R$ %.2f", list);
											 System.out.printf("\nDEP�SITO...................R$ %.2f", list);
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

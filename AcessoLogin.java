package ContaUsuario;

import java.util.ArrayList;
import java.util.Scanner;

public class AcessoLogin extends Pessoa{
	String confcpf, confsenha;
	
	Scanner input = new Scanner(System.in);
	
	public void AcessoLogin() {
	System.out.println("CPF: ");
	confcpf = input.nextLine();
	System.out.println("CPF: ");
	confsenha = input.nextLine();
	if((confcpf.contentEquals(getCpf())) && (confsenha.contentEquals(getSenha()))) {
		System.out.println(" -----  ACESSO PERMITIDO  ------\n");
	}else {
			System.out.println(" -----  ACESSO NEGADO  ------\n");
		}
	}
}
	


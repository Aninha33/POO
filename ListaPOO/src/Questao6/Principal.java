package Questao6;

import java.util.Scanner;

public class Principal {
	
	public static int valor;
	public static int cont = 0;

	public Principal() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Descobrir numero = new Descobrir();
		Informacao usuario = new Informacao();
		numero.Gerador();
		System.out.println("Digite seu nome: ");
		String nome = input.nextLine();
			do {
			System.out.println("Digite um numero: ");
			valor = input.nextInt();
			cont++;
			
			if( valor > numero.NumeroGerado()) {
				System.out.println("Numero que foi digitado eh maior que o gerado");
			}
			if( valor < numero.NumeroGerado()) {
				System.out.println("Numero que foi digitado eh menor que o gerado");
			}
			
		}while(numero.NumeroGerado() != valor );
			usuario.cadastrar(nome, valor, cont);
			System.out.println("Voce acertou o numero");
			System.out.println(usuario.toString());
		
	}

}

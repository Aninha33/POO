package Questao5;

import java.util.Scanner;

public class Principal {
	
	public static int valor;

	public Principal() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Descobrir numero = new Descobrir();
		numero.Gerador();
		do {
			System.out.println("Digite um numero: ");
			valor = input.nextInt();
			
			if( valor > numero.NumeroGerado()) {
				System.out.println("Numero que foi digitado eh maior que o gerado");
			}
			if( valor < numero.NumeroGerado()) {
				System.out.println("Numero que foi digitado eh menor que o gerado");
			}
			
		}while(numero.NumeroGerado() != valor );
		System.out.println("Voce acertou o numero");
		
	}

}

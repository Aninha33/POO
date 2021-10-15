package Questao1e2;

import java.util.Scanner;

/* Elabore um programa orientado a objetos em linguagem de programa��o java
 * com um menu que utilize a Classe java.util.Scanner para ler 
 * numeros Reais. A seguir, crie m�todos para exibir o resultado dos m�todos
 * a seguir da classe java.lang.Math :
 *  1-Abs; 2-Ceil; 3-Cos; 4-Exp; 5-Floor; 6-Log; 7-Max; 8-Min; 9-Pow; 10-Sqrt 
 */

public class Principal {


	private static Scanner entrada;

	public static void menu() {
		System.out.println("\nBem vindo ao Menu! \nOp��o de 0- Sair ");
		System.out.println("Op��o de 1- Abs ");
		System.out.println("Op��o de 2- Ceil ");
		System.out.println("Op��o de 3- Cos ");
		System.out.println("Op��o de 4- Exp ");
		System.out.println("Op��o de 5- Floor ");
		System.out.println("Op��o de 6- Log ");
		System.out.println("Op��o de 7- Max ");
		System.out.println("Op��o de 8- Min ");
		System.out.println("Op��o de 9- Pow ");
		System.out.println("Op��o de 10- Sqrt ");
		System.out.println("Op��o de 11- Hypot");
		System.out.println("Op��o de 12- NextUp ");
		System.out.println("Op��o de 13- Rint ");
		System.out.println("Op��o de 14- Soma ");
		System.out.println("Op��o de 15- Sub ");
		System.out.println("Op��o de 16- Div ");
		System.out.println("Op��o de 17- Resto ");
		System.out.println("Op��o de 18- Mult \n");
	}//menu
	
	public static void main(String[] args) {		
		entrada = new Scanner(System.in);
		
		int opcao;
		float numero;
		
		Operacoes op = new Operacoes();
		Questao2 op2 = new Questao2();
		
		do {
			menu();

			System.out.println("Digite um numero");
			numero = entrada.nextFloat();
			System.out.println("Digite uma op��o ");
			opcao = entrada.nextInt(); 

			switch (opcao) {
				case 0: 
					System.out.println("Fim do Programa");
					break;	
				case 1:
					System.out.println("Op��o de 1- Abs ");
					op.abs(numero);
					System.out.println(op);
					break;
				case 2:
					System.out.println("Op��o de 2- Ceil ");
					op.ceil(numero);
					System.out.println(op);
					break;
				case 3:
					System.out.println("Op��o de 3- Cos ");
					op.cos(numero);
					System.out.println(op);
					break;
				case 4:
					System.out.println("Op��o de 4- Exp ");
					op.exp(numero);
					System.out.println(op);
					break;
				case 5:
					System.out.println("Op��o de 5- Floor ");
					op.floor(numero);
					System.out.println(op);
					break;
				case 6:
					System.out.println("Op��o de 6- Log ");
					op.log(numero);
					System.out.println(op);
					break;
				case 7:
					System.out.println("Op��o de 7- Max ");
					op.max(numero);
					System.out.println(op);
					break;
				case 8:
					System.out.println("Op��o de 8- Min ");
					op.min(numero);
					System.out.println(op);
					break;
				case 9:
					System.out.println("Op��o de 9- Pow ");
					op.pow(numero);
					System.out.println(op);
					break;
				case 10:
					System.out.println("Op��o de 10- Sqrt ");
					op.sqrt(numero);
					System.out.println(op);
					break;
				case 11:
					System.out.println("Op��o de 11- Hypot ");
					op2.hypot(numero);
					System.out.println(op2);
					break;
				case 12:
					System.out.println("Op��o de 12- NextUp ");
					op2.nextUp(numero);
					System.out.println(op2);
					break;
				case 13:
					System.out.println("Op��o de 13- Rint ");
					op2.rint(numero);
					System.out.println(op2);
					break;
				case 14:
					System.out.println("Op��o de 14- Soma ");
					op2.soma(numero);
					System.out.println(op2);
					break;
				case 15:
					System.out.println("Op��o de 15- Sub ");
					op2.sub(numero);
					System.out.println(op2);
					break;
				case 16:
					System.out.println("Op��o de 16- Div ");
					op2.div(numero);
					System.out.println(op2);
					break;
				case 17:
					System.out.println("Op��o de 17- Resto");
					op2.resto(numero);
					System.out.println(op2);
					break;		
				case 18:
					System.out.println("Op��o de 18- Mult");
					op2.mult(numero);
					System.out.println(op2);
					break;

				default:
					System.out.println("Op��o Invalida ");
		
			} // CASE
		}while(opcao != 0);
	}// main

}// principal

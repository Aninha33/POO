package Questao1;
import java.lang.Math;
import java.util.Scanner;


/* Elabore um programa orientado a objetos em linguagem de programa��o java
 * com um menu que utilize a Classe java.util.Scanner para ler 
 * numeros Reais. A seguir, crie m�todos para exibir o resultado dos m�todos
 * a seguir da classe java.lang.Math :
 *  1-Abs; 2-Ceil; 3-Cos; 4-Exp; 5-Floor; 6-Log; 7-Max; 8-Min; 9-Pow; 10-Sqrt 
 */

public class Questao1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	
		System.out.println ("Digite um numero");
		
		float numero = entrada.nextFloat();

		System.out.println ("Digite uma op��o ");

		int opcao = entrada.nextInt();
		Operacoes op = new Operacoes();
		
		switch (opcao) {
			case 1:
				System.out.println ("Op��o de 1- Abs ");
				op.Abs(numero);
				System.out.println(op); 
				break;
			case 2:
				System.out.println ("Op��o de 2- Ceil ");
				op.Ceil(numero);
				System.out.println(op); 
				break;
			case 3:
				System.out.println ("Op��o de 3- Cos ");
				op.Cos(numero);
				System.out.println(op); 
				break;
			case 4:
				System.out.println ("Op��o de 4- Exp ");
				op.Exp(numero);
				System.out.println(op); 
				break;
			case 5:
				System.out.println ("Op��o de 5- Floor ");
				op.Floor(numero);
				System.out.println(op); 
				break;
			case 6:
				System.out.println ("Op��o de 6- Log ");
				op.Log(numero);
				System.out.println(op); 
				break;
			case 7:
				System.out.println ("Op��o de 7- Max ");
				op.Max(numero);
				System.out.println(op); 
				break;
			case 8:
				System.out.println ("Op��o de 8- Min ");
				op.Min(numero);
				System.out.println(op); 
				break;
			case 9:
				System.out.println ("Op��o de 9- Pow ");
				op.Pow(numero);
				System.out.println(op); 
				break;
			case 10:
				System.out.println ("Op��o de 10- Sqrt ");
				op.Sqrt(numero);
				System.out.println(op); 
				break;

			default: 	
				System.out.println ("Op��o Invalida ");
     
		} // CASE
	
	}//main

}//principal

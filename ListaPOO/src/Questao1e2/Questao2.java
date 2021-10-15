package Questao1e2;

import java.util.Scanner;

/* Elabore um programa orientado a objetos em linguagem de programacao java
 * com a adição de uma nova classe ao excercicio anterior.
 * Exploque com um comentario em bloco no inicio da classe, o propósito dessa classe
 * A classe deve ser utilizada durante a execução do programa e conter a definicao de novos atributos e comportamentos   
 */


/* Programa Orientado a Objetos em linguagem de programação java
 * com a adição de uma novas classes que tem a função de fazer:
 * hypot, nextUp, rint, soma, sub, div, resto, mult
 */

public class Questao2 {
	Scanner entrada = new Scanner(System.in);
	
	public float resultado;
	
	public Questao2() {

	}//construtor Questao2
	
	public void hypot(float numero){		
		System.out.println ("Digite um outro numero");
		float numero2= entrada.nextFloat();
		
		resultado = (float) Math.hypot(numero, numero2);
	}//hypot

	public void nextUp(float numero){		
		resultado = Math.nextUp(numero);
	}//nextUp

	public void rint(float numero){		
		resultado = Math.nextUp(numero);
	}//rint


	public void soma(float numero){		
		System.out.println ("Digite um outro numero");
		float numero2= entrada.nextFloat();
		
		resultado = numero + numero2;
	}//soma

	public void sub(float numero){		
		System.out.println ("Digite um outro numero");
		float numero2= entrada.nextFloat();
		
		resultado = numero - numero2;
	}//sub

	public void div(float numero){		
		System.out.println ("Digite um outro numero");
		float numero2= entrada.nextFloat();
		
		resultado = numero / numero2;
	}//div
	
	public void resto(float numero){		
		System.out.println ("Digite um outro numero");
		float numero2= entrada.nextFloat();
		
		resultado = numero % numero2;
	}//resto
	
	public void mult(float numero){		
		System.out.println ("Digite um outro numero");
		float numero2= entrada.nextFloat();
		
		resultado = numero * numero2;
	}//mult
	
	public String toString() {
		return "Resultado = " + resultado;
	}//resultado
	
}//Questão2

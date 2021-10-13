package Questao1;

import java.util.Scanner;

public class Operacoes {
	Scanner entrada = new Scanner(System.in);
	
	public float resultado;


	
	public void Abs(float numero){
		 resultado = Math.abs(numero);
	}//Abs
	
	public void Ceil(float numero){
		 resultado = (float) Math.ceil(numero);
	}//Ceil
	
	public void Cos(float numero){
		 resultado = (float) Math.cos(numero);
	}//Cos

	public void Exp(float numero){
		 resultado = (float) Math.exp(numero);
	}//Exp

	public void Floor(float numero){
		 resultado = (float) Math.floor(numero);
	}//Floor

	public void Log(float numero){
		 resultado = (float) Math.log(numero);
	}//Log
	
	public void Max(float numero){		
		System.out.println ("Digite um outro numero");
		float numero2= entrada.nextFloat();
		
		resultado = Math.max(numero, numero2);
	}//Max

	public void Min(float numero){	
		System.out.println ("Digite um outro numero");
		float numero2= entrada.nextFloat();
		
		resultado = Math.min(numero, numero2);
	}//Min
	
	public void Pow(float numero){
		System.out.println ("Digite um outro numero");
		float numero2= entrada.nextFloat(); 
	
		resultado = (float) Math.pow(numero, numero2);
	}//Pow
	
	public void Sqrt(float numero){
		 resultado = (float) Math.sqrt(numero);
	}//Sqrt
	
	public String toString() {
		return "Resultado = " + resultado;
	}

}//operacoes



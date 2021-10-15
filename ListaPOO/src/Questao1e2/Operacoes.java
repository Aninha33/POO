package Questao1e2;

import java.util.Scanner;
import java.lang.Math;

public class Operacoes {
	Scanner entrada = new Scanner(System.in);
	
	public float resultado;
	
	public void abs(float numero){
		 resultado = Math.abs(numero);
	}//Abs
	
	public void ceil(float numero){
		 resultado = (float) Math.ceil(numero);
	}//Ceil
	
	public void cos(float numero){
		 resultado = (float) Math.cos(numero);
	}//Cos

	public void exp(float numero){
		 resultado = (float) Math.exp(numero);
	}//Exp

	public void floor(float numero){
		 resultado = (float) Math.floor(numero);
	}//Floor

	public void log(float numero){
		 resultado = (float) Math.log(numero);
	}//Log
	
	public void max(float numero){		
		System.out.println ("Digite um outro numero");
		float numero2= entrada.nextFloat();
		
		resultado = Math.max(numero, numero2);
	}//Max

	public void min(float numero){	
		System.out.println ("Digite um outro numero");
		float numero2= entrada.nextFloat();
		
		resultado = Math.min(numero, numero2);
	}//Min
	
	public void pow(float numero){
		System.out.println ("Digite um outro numero");
		float numero2= entrada.nextFloat(); 
	
		resultado = (float) Math.pow(numero, numero2);
	}//Pow
	
	public void sqrt(float numero){
		 resultado = (float) Math.sqrt(numero);
	}//Sqrt
	
	public String toString() {
		return "Resultado = " + resultado;
	}//resultado

}//operacoes



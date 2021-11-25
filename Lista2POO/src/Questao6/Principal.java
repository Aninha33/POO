package Questao6;

import java.util.Scanner;
import java.lang.Math;


public class Principal {

	private static Scanner leitor;

	public Principal() {

	}//Construtor

	
	public static void main(String[] args) {
		
        leitor = new Scanner( System.in );
        
        System.out.println("Digite o Valor de A:" );
        int A = leitor.nextInt();

        System.out.println("Digite o Valor de B: ");
        int B = leitor.nextInt();

        System.out.println("Digite o Valor de C:" );
        int C = leitor.nextInt();
        
        float resultado = 0;
        
        try {
        	if(A == 0) throw new ExceptionA();
        	
        	if(B == 0) throw new ExceptionB();
        	
        	if(C == 0) throw new ExceptionC();
        
           resultado = (float) (1 / Math.sqrt(Math.pow(A,2) * Math.pow(B,2) * Math.pow(C,2)));
           System.out.println("\n Resultado:"+ resultado);
        } catch(ExceptionC e){
        	System.out.println(e.getMessage());
        } catch(ExceptionB e){
        	System.out.println(e.getMessage());
        } catch(ExceptionA e){
        	System.out.println(e.getMessage());
        }//catch	
	}//main
}//Principal

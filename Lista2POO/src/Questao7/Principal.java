package Questao7;

import java.io.IOException;
import java.lang.Math;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	private static Scanner leitor;

	public Principal() {

	}//Construtor

	public static void excecaoCalculo(int A, int B) {
		float resultado = 0;
		int x = 0;
        try {
        	
        	if(A == 0) throw new ExceptionA();
        	
        	if(B == 0) throw new ExceptionB();
        	
           resultado = (float) (1/Math.sqrt(Math.pow(A,2) * Math.pow(B,2)));
            System.out.println("\n Resultado:"+ resultado);
        } catch(ExceptionA e){
        	System.out.println(e.toString());
        	
        	//e.printStackTrace();
        }//catch
	}//excecaoCalculo
	
	public static void excecaoArquivo() {
		 BufferedReader arquivo = null;
		 try {
			arquivo = new BufferedReader(new FileReader("testinho"));
		 } catch (IOException e) {
			System.out.println("\n ERRO IOException - erro nas operações de entrada e saída do arquivo");
		}//catch
	}//excecaoArquivo
	
	public static void excecaoNullPointerException() {
		List listinha = new ArrayList();
		listinha = null;
		try {
			int x = listinha.size();
			
		} catch (NullPointerException e) {
			System.out.println("\n ERRO NullPointerException - objeto não definido ");
		}//catch
	}//excecaoNullPointerException

	
public static void main(String[] args){
		
        leitor = new Scanner( System.in );
        
        System.out.println("Digite o Valor de A:" );
        int A = leitor.nextInt();

        System.out.println("Digite o Valor de B: ");
        int B = leitor.nextInt();

        excecaoCalculo(A, B);
        excecaoArquivo();
        excecaoNullPointerException();
	
	}//main
}//Principal
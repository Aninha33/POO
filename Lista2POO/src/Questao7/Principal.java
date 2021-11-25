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

	
	public static void excecao(int A, int B) {
		 BufferedReader arquivo = null;
		 List listinha = new ArrayList();
		 listinha = null;
		 float resultado = 0;
		 
		 try {
			arquivo = new BufferedReader(new FileReader("testinho"));	
		 }catch (IOException e) {
				System.out.println("\n ERRO IOException - erro nas operações de entrada e saída do arquivo");
				try {
					int x = listinha.size();
				}catch (NullPointerException p) {
					System.out.println("\n ERRO NullPointerException - objeto não definido ");
					try {
						if(A == 0) throw new ExceptionA();
			        	
			        	if(B == 0) throw new ExceptionB();
			            resultado = (float) (1/Math.sqrt(Math.pow(A,2) * Math.pow(B,2)));
			            System.out.println("\n Resultado:"+ resultado);
					}catch(ExceptionB y){
						System.out.println(y.getMessage());
					}catch(ExceptionA y){
						System.out.println(y.getMessage());
					}//catch 
				}//catch
		}//catch
	}//excecao

	
public static void main(String[] args){
		
        leitor = new Scanner( System.in );
        
        System.out.println("Digite o Valor de A:" );
        int A = leitor.nextInt();

        System.out.println("Digite o Valor de B: ");
        int B = leitor.nextInt();

        excecao(A, B);
   
	}//main
}//Principal
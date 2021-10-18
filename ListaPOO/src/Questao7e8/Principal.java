package Questao7e8;

public class Principal {
	
	public static int D;

	public Principal() {
	
	}//construtor Principal
	
	public static void main(String[] args) {
	 int A = 0, B = 0, C = 0;
	 
	 Pendulo pendulo = new Pendulo(A, B, C);
	 Ocilacoes ocilacoes = new Ocilacoes();
	 pendulo.oscilar();
	 System.out.println(pendulo.toString());
	  D = pendulo.getA();
	  ocilacoes.total(D);
	  System.out.println(ocilacoes.toString());
	}//main

}//Principal
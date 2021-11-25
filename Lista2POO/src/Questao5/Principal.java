package Questao5;

public class Principal {

	public static void main(String[] args) {
		Soma soma = new Soma();
		
			soma.setOperando1(5.6f);
			soma.setOperando2(1.7f);
			System.out.println(soma.toString());
		
		Soma soma2 = new Soma();
		
			soma2.setOperando1(10.6f);
			soma2.setOperando2(0.7f);
			System.out.println(soma2.toString());
		
		Subtracao subtracao = new Subtracao();

			subtracao.setOperando1(2.5f);
			subtracao.setOperando2(2.5f);
			System.out.println(subtracao.toString());
			
		Divisao divisao = new Divisao();
			
			divisao.setOperando1(2.5f);
			divisao.setOperando2(0.0f);
			System.out.println(divisao.toString());
				
				
		Multiplicacao multiplicacao = new Multiplicacao();

	
			multiplicacao.setOperando1(2.5f);
			multiplicacao.setOperando2(2.5f);
			System.out.println(multiplicacao.toString());

	}

}

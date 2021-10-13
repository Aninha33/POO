package Questao5;

import java.util.Random;

public class Descobrir {
	private int numero;

	public void Gerador(){
		int min = 1;
		int max = 10;
		Random random = new Random();
		do {
		numero = random.nextInt(10);
		}while(numero == 0);
		
	}
	public int NumeroGerado() {
		return this.numero;
	}

}

package Questao3e4;

import java.util.Random;

/** 
 * Complemento da questão3
 * Uma classe estacionamento ao qual conta a quantidade de horas e com base nisso ganha um desconto
 * Também determina a Quantidade de vagas ocupadas e em qual vaga o carro está estacionado.
 */
public class Questao4 {
	
	private String tipoCarro;
	private String placaCarro;
	private int periodoTotal;
	private int ocupadas;
	
	public Questao4(String tipoCarro, String placaCarro, int periodoTotal){
		this.tipoCarro = tipoCarro;
		this.placaCarro = placaCarro;
		this.periodoTotal = periodoTotal;
 	}//construtor questao4
	
	public void estacionamento() {
		if(periodoTotal > 60) {
			System.out.println("Ganhou desconto de 5%");
			System.out.println("Valor a se pagar com desconto é de R$ 19,00");
		}else System.out.println("Quantidade de horas não foram suficientes para ganhar um desconto.");		
	}//estacionamento
	
	//Usando o random para supor a quantidade de carros estacionados, para verificar se existe ou não vagas
	public void vagas() {
		Random random = new Random();
		ocupadas = random.nextInt(10);
		
		System.out.println("Todas as Vagas até o número " +ocupadas+ " estão ocupadas.\nCarro: " 
								+this.tipoCarro+ " com a Placa: " +this.placaCarro+ " encontra-se estacionado na vaga " +(ocupadas+1));			
	}//vagas
	
}//Questao4

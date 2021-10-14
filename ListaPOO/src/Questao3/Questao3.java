package Questao3;

import java.util.Scanner;
/* Um estacionamento deve ser capaz de cadastrar o 
 * tipo do veiculo,a placa, o horario de saida e o horario de entrada do veiculo
 * o valor a ser pago é de acordo com a seguinte tabela:
 * periodo: até 30 minutos. Valor: gratuito
 * periodo: de 30 minutos até 1 hr. Valor: 10,00
 * periodo: acima de 1 hora. Valor: 20,00
 */

public class Questao3 {

	public static void main(String[] args) {
		String tipoCarro;
		String placaCarro;
		int horaSaida, minSaida, horaEntrada, minEntrada;
		
		CadastroCarro carro = new CadastroCarro(); 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o tipo do carro");
		tipoCarro = entrada.nextLine();
		
		System.out.println("Digite a placa do carro");
		placaCarro = entrada.nextLine();

	    System.out.println("Digite a hora de Entrada do carro");
	    horaEntrada= entrada.nextInt();

	    System.out.println("Digite o minuto de Entrada do carro");
	    minEntrada= entrada.nextInt();

		System.out.println("Digite a hora de Saida do carro");
	    horaSaida = entrada.nextInt();

	    System.out.println("Digite o minuto de Saida do carro");
	    minSaida = entrada.nextInt();

		carro.Periodos(tipoCarro, placaCarro, horaSaida, minSaida, horaEntrada, minEntrada);
		
	}//main

}//Questao3

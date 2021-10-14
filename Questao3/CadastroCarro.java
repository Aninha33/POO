package Questao3;

public class CadastroCarro {
	
	//tipo do veiculo,a placa, o horario de saida e o horario de entrada do veiculo
	public void Periodos(String tipoCarro, String placaCarro, int horaSaida,int minSaida,int horaEntrada, int minEntrada) {
		int periodoEntrada = (horaEntrada* 60) + minEntrada;
		int periodoSaida = (horaSaida * 60) + minSaida;
		
		int periodoTotal = periodoSaida - periodoEntrada;
		
		if(periodoTotal < 30) {
			 System.out.println ("Carro: " +tipoCarro+ " com a Placa: " +placaCarro+ ". \nValor a ser pago: Gratuido");
		
		}else if(periodoTotal >= 30 && periodoTotal <= 60) {
			 System.out.println ("Carro: " +tipoCarro+ " com a Placa: " +placaCarro+ ". \nValor a ser pago:R$ 10,00");
		
		}else System.out.println ("Carro: " +tipoCarro+ " com a Placa: " +placaCarro+ ". \nValor a ser pago: R$ 20,00");
	}//Periodos
}//CadastroCarro



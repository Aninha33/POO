package Questao3e4;

public class Pagamento {
	private String tipoCarro;
	private String placaCarro;
	private int horaSaida;
	private int minSaida;
	private int horaEntrada;
	private int minEntrada;
	public int periodoTotal;
	
	public Pagamento(String tipoCarro, String placaCarro, int horaSaida,int minSaida,int horaEntrada, int minEntrada){
		this.tipoCarro = tipoCarro;
		this.placaCarro = placaCarro;
		this.horaSaida = horaSaida;
		this.minSaida = minSaida;
		this.horaEntrada = horaEntrada;
		this.minEntrada = minEntrada;
 	}//construtor Pagamento
	
	//tipo do veiculo,a placa, o horario de saida e o horario de entrada do veiculo
	public void periodos() {
		int periodoEntrada = (this.horaEntrada* 60) + this.minEntrada;
		int periodoSaida = (this.horaSaida * 60) + this.minSaida;
		
		int periodoTotal = periodoSaida - periodoEntrada;
		
		if(periodoTotal < 30) {
			 System.out.println ("\nCarro: " +this.tipoCarro+ " com a Placa: " +this.placaCarro+ ". Valor a ser pago: Gratuido");
		
		}else if(periodoTotal >= 30 && periodoTotal <= 60) {
			 System.out.println ("\nCarro: " +this.tipoCarro+ " com a Placa: " +this.placaCarro+ ". Valor a ser pago:R$ 10,00");
		
		}else System.out.println ("\nCarro: " +this.tipoCarro+ " com a Placa: " +this.placaCarro+ ". Valor a ser pago: R$ 20,00");
	
		Questao4 estacionamento = new Questao4(this.tipoCarro, this.placaCarro, periodoTotal);
		estacionamento.estacionamento();
		estacionamento.vagas();
	}//Periodos
	
}//CadastroCarro



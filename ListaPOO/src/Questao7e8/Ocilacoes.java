package Questao7e8;

public class Ocilacoes {
	private int num_ocilacoes;
	public Ocilacoes() {
		// TODO Auto-generated constructor stub
	}
	public void total(int n){
		this.num_ocilacoes = n*n*n;		
	}
	public String toString() {
		return "Ocorreram "+this.num_ocilacoes+" ocilacões até finalizar o programa";
	}

}

package Questao1;

public class Sapo extends Anfibio {
	
	public Sapo(String nome,String quantidade) {
		super(nome,quantidade);
	}

	public String toString(){
		return "Nome: "+ this.nome + "\nQuantidade de Escama: "+this.quantidadedeEscamas;
	}
}

package Questao1;

public class Ra extends Anfibio {
	
	public Ra(String nome,String quantidade) {
		super(nome,quantidade);
	}

	public String toString(){
		return "Nome: "+ this.nome + "\nQuantidade de Escama: "+this.quantidadedeEscamas;
	}
}

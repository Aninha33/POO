package Questao1;

public class Leao extends Terrestre {
	
	public Leao(String nome,String quantidade) {
		super(nome,quantidade);
	}

	public String toString(){
		return "Nome: "+ this.nome + "\nQuantidade de Pelos: "+this.quantidadedePelos;
	}
}

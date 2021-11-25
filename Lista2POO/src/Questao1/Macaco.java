package Questao1;

public class Macaco extends Terrestre {
	
	public Macaco(String nome,String quantidade) {
		super(nome,quantidade);
	}

	public String toString(){
		return "Nome: "+ this.nome + "\nQuantidade de Pelos: "+this.quantidadedePelos;
	}
}

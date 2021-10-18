package Questao9;


public class Computador extends Data {
	private String nome,marca;
	public Computador() {
		
	}
	public Computador setNome(String nome) {
		this.nome = nome;
		return this;
	}
	public Computador setMarca(String marca) {
		this.marca = marca;
		return this;
	}
	public String toString() {
		return "Nome: "+this.nome+
				"\nMarca: " + this.marca+
				"\nData: "+this.dia+","+this.mes+
				","+this.ano;
	}
}

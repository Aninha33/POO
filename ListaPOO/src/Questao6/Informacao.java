package Questao6;
/* Essa classe serve para armazenar algumas informações do usuário
 * como seu nome, o numero que foi sorteado e quantas tentativas o usuário
 * necessitor para acerta.
 */

public class Informacao {
	
	private String nome;
	private int numero;
	private int tentativa;

	public Informacao() {
		// TODO Auto-generated constructor stub
	}
	public void cadastrar(String nome, int numero, int tentativa) {
		this.nome = nome;
		this.numero = numero;
		this.tentativa = tentativa;
		}
	public String toString() {
		return "Nome: "+ this.nome+
				"\nNumero sorteado: "+ this.numero+
				"\nForam necessarias " + this.tentativa+
				" tentativas para encontrar o numero";
	}
}

package Questao2;

public class Bolsista extends MembroUniversidade {
	
	public Bolsista(float s) {
		super(s);
	}

	public void pagamento() {
		System.out.println(toString());
	}
	
	public String toString() {
		return "O salario eh: "+this.salario;
	}


}

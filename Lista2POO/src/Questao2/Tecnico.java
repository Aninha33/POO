package Questao2;

public class Tecnico extends MembroUniversidade {
	
	public Tecnico(float s) {
		super(s);
	}

	public void pagamento() {
		System.out.println(toString());
	}
	
	public String toString() {
		return "O salario eh: "+this.salario;
	}


}

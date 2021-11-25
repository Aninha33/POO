package Questao2;

public class Administrador extends MembroUniversidade {
	
	public Administrador(float s) {
		super(s);
	}

	public void pagamento() {
		System.out.println(toString());
	}
	
	public String toString() {
		return "O salario eh: "+this.salario;
	}


}

package Questao2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<MembroUniversidade> lista = new ArrayList<>();
		lista.add(new Administrador(4000.0f));
		lista.add(new Bolsista(700.0f));
		lista.add(new Professor(10000.0f));
		lista.add(new Tecnico(1500.0f));
		
		for(MembroUniversidade item: lista) {
			item.pagamento();
		}
	}

}

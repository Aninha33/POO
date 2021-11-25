package Questao4;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Empregado> lista = new ArrayList<>();
		lista.add(new Bonificado("Joao","Silva",1000.0f,200.0f,333.0f));
		lista.add(new Comissionado("Maria","Soares",1000.0f,0.05f,10000.0f));
		lista.add(new Horista("Jomar","Silva Soares",2000.0f,10,100.0f));
		
		for(Empregado item:lista) {
			item.ganhos();
			item.imprimir();
		}
	}

}

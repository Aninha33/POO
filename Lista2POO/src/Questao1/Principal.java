package Questao1;

import java.util.ArrayList;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ArrayList<Animal> lista = new ArrayList<>();
		lista.add(new Sapo("sapo","pouco"));
		lista.add(new Ra("ra","pouco"));
		lista.add(new Leao("leao","muito"));
		lista.add(new Macaco("macaco","pouco"));
		for(Animal item:lista) {
			System.out.println(item.toString());
		}
	}

}

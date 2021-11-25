package Questao3;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<IConversorMoeda>lista = new ArrayList<>();
		lista.add(new Real("reais",50,4));
		lista.add(new BitCoin("bitcoin", 50, "Virtual"));
		lista.add(new Euro("euro",50,"Portugual"));

	for(IConversorMoeda item:lista) {
		System.out.println(item.getConversaoDolar());
	}

  }
}

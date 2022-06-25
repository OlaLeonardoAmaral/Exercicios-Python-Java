package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		
		lista.add("Maria");
		lista.add("Bob");
		lista.add("Alex");
		lista.add("Anna");
		lista.add(2, "Marco");
		
		System.out.println(lista.size());
		
		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("---------------");

		// lista.remove(1);
		// Remove todos os nomes que começam com a letra M
		lista.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		System.out.println("Qual a posição da Anna na minha lista? " + lista.indexOf("Anna"));

		// retorna -1 se caso o marco não tiver na lista ou qualquer outro elemento
		System.out.println("Qual a posição do Marco na minha lista? " + lista.indexOf("Marco"));

		System.out.println("---------------");
		// pesquisa pelas pessoas que começam com a letra A na minha lista lista

		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		// Pega o primeiro nome que começa com A ou retorna null 
		String name = lista.stream().filter(x-> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);
		
		
	}
}

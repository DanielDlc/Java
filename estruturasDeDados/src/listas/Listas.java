package listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		
		list.add("Daniel");
		list.add("Diego");
		list.add("Jean");
		list.add("Max");
		list.add("Piu");
		
		for (String nome : list) {
			System.out.println(nome);
		}		
		list.add(2, "Leandro");             // adicionar elemento.
		list.remove(4);                    // remover usando �ndice. 
		System.out.println(list.size());  // tamanho da lista.
		
	}

}

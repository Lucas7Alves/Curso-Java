package aula98;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysList {

	public static void main(String[] args) {
		
		List <String> nomes = new ArrayList<>();
		
		nomes.add("Maria");
		nomes.add("Laura");
		nomes.add("Jinx");
		nomes.add("Adjailson");
		nomes.add("Millena");
		
		//tamanho da lista
		System.out.println("Tamanho da lista: "+nomes.size());	
		
		//add em uma posi��o espec�fica
		nomes.add(2, "Alex");
		System.out.println("add Alex na posi��o 2");
		for (String i : nomes) {
			System.out.println(i);
		}
		System.out.println("------------------------------------");
		
		//remove com base no valor oferecido
		nomes.remove("Laura");
		System.out.println("Removendo Laura");
		for (String i : nomes) {
			System.out.println(i);
		}
		System.out.println("------------------------------------");
		//removendo com um predicado
		//no () ocorre uma opera��o lambda
		nomes.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("Removendo os come�ado em M");
		for (String i : nomes) {
			System.out.println(i);
		}
		System.out.println("---a---------------------------------");
		//filtrar com predicado
		List <String> resultado = nomes.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		//						esse stream aceita opera��es lambda
		for (String i : resultado) {
			System.out.println(i);
		}
		System.out.println("------------------------------------");
		
		/*
	 	econtrar a posi��o de um elemento, se achar retorna a pos��o
		se n�o retorna -1 
		*/
		System.out.println(nomes.indexOf("Jinx"));
		for (String i : nomes) {
			System.out.println(i);
		}
		System.out.println("------------------------------------");
		//filtrando somente o primeiro nome come�ado em J, e atribuindo a uma vari�vel
		String nome = nomes.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); // se n�o achar retorna null
		System.out.println(nome);
	}

}

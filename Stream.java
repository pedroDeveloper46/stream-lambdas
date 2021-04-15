package Exercicios;

import java.util.List;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CRIEI UMA LISTA PARA PODER USAR UMA STREAM
		
		List<String> nomes = List.of("pedro", "joão", "carlos");
		
		
		//AQUI CHAMEI A stream, DEPOIS CHAMEI O FILTER E DIZENDO QUE QUERO QUE ELE FILTRE ENTRE OS ELEMENTOS DA LISTA AQUELE ELEMENTO QUE COMECE COM A LETRA P
		//EM SEGUIDA CHAMEI O MAP, PARA ELE MAPEAR TODOS OS ELEMENTOS E DEIXAR TODOS ELES EM MAIUSCULOS
		//POR ULTIMO CHAMEI O FOREACH PARA PODER MOSTRAR TODOS OS ELEMENTOS, ELE RETORNARÁ APENAS O ELEMENTE "pedro" DEVIDO AO FILTRO QUE FIZ USANDO O FILTER 
		nomes.stream()
		   .filter(n -> n.startsWith("p"))
		   .map(n -> n.toUpperCase())
		   .forEach(n -> System.out.println(n));

	}

}

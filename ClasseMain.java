package Exercicios;

import java.util.Iterator;

public class ClasseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CRIEI UM VETOR QUE IREI USAR NAS LAMBDAS
		int[] vetor = {1,2,3,4};
		
		//COM O USO DA ANNOTATION @FunctionalInterface, ESTOU FAZENDO O OBJETO DO TIPO Inteiro RECEBER UMA EXPRESS�O LAMBDA, COM ISSO ESSA EXPRESS�O SER� IMPLEMENTADA DIRETA NO M�TODO retornaResultado(int[] array), OU SEJA, A EXPRESS�O LAMBA SER� O CORPO DO M�TODO 
	    Inteiro soma = (array) -> {
	    	
	    	int somaTotal = 0;
	    	
	    	for (int i = 0; i < array.length; i++) {
				somaTotal += array[i];
			}
	    	
	    	return somaTotal;
	    	
	    };
	    
	    //NA EXPRESS�O LAMBDA ACIMA DEFINI QUE ELA IR� RETORNAR UM VALOR TOTAL DA SOMA ENTRE OS ELEMENTOS DO ARRAY
	    //COM A LAMBDA FEITA, POSSO AGORA INVOCAR O METODO retornaResultado(int[] array) USANDO O OBJETO soma E PASSANDO O ARRAY, O RESULTADO FINAL SER� A SOMA FINAL ENTRE OS ELEMENTOS DO ARRAY
	    System.out.println("SOMA ====>" +soma.retornaResultado(vetor));
	    
	    
	    //AQUI � A MESMA COISA, POR�M A LAMBA AGORA EST� RETORNANDO A MULTIPLICA��O ENTRE OS ELEMENTOS
	    Inteiro multiplicao = (array) -> {
	    	int resultFinal = 1;
	    	
	    	for (int i: array) {
				resultFinal *= i; 
			}
	    	
	    	return resultFinal;
	    };
	    
	    System.out.println("MULTIPLICA��O ====>" +multiplicao.retornaResultado(vetor));
	    
	    
	}

}

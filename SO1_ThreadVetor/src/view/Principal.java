// Criar em java um projeto com uma Thread chamada ThreadVetor, 
// que receba um valor num�rico e vetor como par�metros.
// Caso o valor num�rico seja par, a thread deve percorrer o vetor utilizando uma 
// estrutura for (int i = 0 ; i < vet.length; i++) e contar o tempo para percorrer o vetor.  
// Caso o valor num�rico seja �mpar, a thread deve percorrer o vetor utilizando uma 
// estrutura foreach e contar o tempo para percorrer o vetor.
// No final, ambas as possibilidades devem apresentar o tempo em segundos.
// A opera��o main deve gerar um vetor de 1000 posi��es com valores aleat�rios de 1 a 100.
// Deve iniciar 2 ThreadVetor e para uma passar o n�mero 1 e o vetor e para a outra, 
// passar o n�mero 2 e o mesmo vetor 

package view;

import controller.ThreadVetor;

public class Principal { // Chama as Threads
	
	public static void main(String[] args) {
		
		// Criar o vetor de 1000 posi��es
		int tamanho = 1000;
		int[] vetor = new int [tamanho];
		
		// Gerar n�meros aleat�rios
		// Math.random() gera n�meros entre 0 e 0,999, portanto multiplica por 100 para ter entre 0 e 99
		// Soma +1 para ter a possibilidade do n�mero 100 e eliminar a possibilidade de ter 0
		for (int i = 0; i < tamanho ; i++) {
			int num = (int) ((Math.random() * 100) + 1);
			vetor[i] = num; // salva o numero gerado de acordo com indice na variavel num
		}
		
		// Classe ThreadVetor
		// Tratando-se de Threads sempre haver� a possibilidade de iniciar com 1 ou 2, aleat�riamente
		
		
		// Inicia essa Thread com o numero 1 e verifica que � �mpar, logo executa Foreach
		Thread tv1 = new ThreadVetor(vetor, 1);
		tv1.start();
		
		// Inicia essa Thread com o numero 2 e verifica que � par, logo executa For
		Thread tv2 = new ThreadVetor(vetor, 2);
		tv2.start();
		
	}

}

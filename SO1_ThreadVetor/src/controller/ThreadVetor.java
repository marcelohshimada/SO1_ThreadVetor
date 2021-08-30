package controller;

public class ThreadVetor extends Thread {

	private int[] vetor;
	private int verifica;

	public ThreadVetor(int[] vetor, int verifica) {
		this.vetor = vetor;
		this.verifica = verifica;
	}

	@Override 
	public void run() {
		if (verifica % 2 == 0) {
			execFor(); // se for número par ==> execFor()
		} else {
			execForeach(); // se for número ímpar ==> execFor()
		}
	}

	private void execFor() {
		double tempoInicial = System.nanoTime();

		for (int i = 0; i < vetor.length; i++) {
//			System.out.println("Laço For Vetor #" + i + " = " + vetor[i]);
		}

		double tempoFinal = System.nanoTime();
//		 ns -> s ==> / 10 ^ 9 ==> Math.pow(10, 9)
		double tempoTotal = (tempoFinal - tempoInicial) / (Math.pow(10, 9));
		System.out.println("\nTempo c/ estrutura For ==> " + tempoTotal + "s");

	}
	
	private void execForeach() {
		double tempoInicial = System.nanoTime();
		
		for (int i: vetor) {
//			System.out.println("Laço Foreach Vetor #" + i + " = " + vetor[i]);
		}
		
		double tempoFinal = System.nanoTime();
		// ns -> s ==> / 10 ^ 9 ==> Math.pow(10, 9)
		double tempoTotal = (tempoFinal - tempoInicial) / (Math.pow(10, 9));
		System.out.println("\nTempo c/ estrutura Foreach ==> " + tempoTotal + "s");
	}

}

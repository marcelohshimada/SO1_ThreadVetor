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
			execFor(); // se for n�mero par ==> execFor()
		} else {
			execForeach(); // se for n�mero �mpar ==> execFor()
		}
	}

	private void execFor() {
		double tempoInicial = System.nanoTime();

		for (int i = 0; i < vetor.length; i++) {
//			System.out.println("La�o For Vetor #" + i + " = " + vetor[i]);
		}

		double tempoFinal = System.nanoTime();
//		 ns -> s ==> / 10 ^ 9 ==> Math.pow(10, 9)
		double tempoTotal = (tempoFinal - tempoInicial) / (Math.pow(10, 9));
		System.out.println("\nTempo c/ estrutura For ==> " + tempoTotal + "s");

	}
	
	private void execForeach() {
		double tempoInicial = System.nanoTime();
		
		for (int i: vetor) {
//			System.out.println("La�o Foreach Vetor #" + i + " = " + vetor[i]);
		}
		
		double tempoFinal = System.nanoTime();
		// ns -> s ==> / 10 ^ 9 ==> Math.pow(10, 9)
		double tempoTotal = (tempoFinal - tempoInicial) / (Math.pow(10, 9));
		System.out.println("\nTempo c/ estrutura Foreach ==> " + tempoTotal + "s");
	}

}

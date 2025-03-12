package controller;

import br.edu.fateczl.ordenacao.Ordenacao;

public class TempOrdController {

	public TempOrdController(){
		super();
	}
	
	public void ordenaBubble(int [] vetor) {
		Ordenacao ord = new Ordenacao();
		double tempoIncical = System.nanoTime();
		ord.bubbleSort(vetor);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoIncical;
		System.out.println("BubbleSort = " + tempoTotal / Math.pow(10, 9) + " s.");
	}
	
	public void ordenaMerge(int [] vetor) {
		Ordenacao ord = new Ordenacao();
		double tempoIncical = System.nanoTime();
		ord.mergeSort(vetor);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoIncical;
		System.out.println("MergeSort = " + tempoTotal / Math.pow(10, 9) + " s.");
	}
	
	public void ordenaQuick(int [] vetor) {
		Ordenacao ord = new Ordenacao();
		double tempoIncical = System.nanoTime();
		ord.quickSort(vetor);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoIncical;
		System.out.println("QuickSort = " + tempoTotal / Math.pow(10, 9) + " s.");
	}
}

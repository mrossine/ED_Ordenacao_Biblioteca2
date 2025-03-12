package controller;

import br.edu.fateczl.ordenacao.Ordenacao;

public class OrdenaVetController {

	public OrdenaVetController() {
		super();
	}
	
	public void ordenaBubble(int [] vetor) {
		Ordenacao ord = new Ordenacao();
		ord.bubbleSort(vetor);
		for(int i : vetor) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public void ordenaMerge(int [] vetor) {
		Ordenacao ord = new Ordenacao();
		ord.mergeSort(vetor);
		for(int i : vetor) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public void ordenaQuick(int [] vetor) {
		Ordenacao ord = new Ordenacao();
		ord.quickSort(vetor);
		for(int i : vetor) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

package view;

import controller.TempOrdController;

public class PrincipalTempoOrdenacao {

	public static void main(String [] args) {
		TempOrdController n = new TempOrdController();
		int [] vetor = new int [100000];
		
		for(int i = 0; i < 1500; i++) {
			vetor[i] = 1499 - i;
		}
		
		n.ordenaBubble(vetor);
		n.ordenaMerge(vetor);
		n.ordenaQuick(vetor);
		
	}

}

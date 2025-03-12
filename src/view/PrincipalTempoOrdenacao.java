package view;

import java.util.Random;

import controller.TempOrdController;

public class PrincipalTempoOrdenacao {

	public static void main(String [] args) {
		TempOrdController n = new TempOrdController();
		Random rd = new Random();
		int [] vetor = new int [100000];
		
		for(int i = 0; i < 100000; i++) {
			vetor[i] = rd.nextInt(150) + 1;
		}
		
		n.ordenaBubble(vetor);
		n.ordenaMerge(vetor);
		n.ordenaQuick(vetor);
		
	}

}

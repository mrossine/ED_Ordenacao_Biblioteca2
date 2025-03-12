package view;

import javax.swing.JOptionPane;

import controller.OrdenaVetController;

public class PrincipalOrdenaVetores {

	public static void main(String[] args) {
		OrdenaVetController n = new OrdenaVetController();
		int opc = 0;
		while(opc != 9) {
			int [] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
			int [] vetor2 = {44, 43, 42, 41, 40, 39, 38};
			int [] vetor3 = {31, 32, 33, 34, 99, 98, 97, 96};
			opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL \n 1 - Ordena Vetor Ex1 \n 2 - Ordena Vetor Ex2 \n 3 - Ordena Vetor Ex3 \n 9 - Finaliza Programa"));
			switch(opc) {
				case 1:
					n.ordenaQuick(vetor1);
					break;
				case 2:
					n.ordenaQuick(vetor2);
					break;
				case 3:
					n.ordenaQuick(vetor3);
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "FIM DO PROGRAMA");
					break;
				default:
					JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
			}
		}
	}
}

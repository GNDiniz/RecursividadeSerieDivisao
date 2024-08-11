package view;

import controller.SerieDivisaoController;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		SerieDivisaoController sdc = new SerieDivisaoController();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
		
		double serieDiv = sdc.serieDivisao(n);
		System.out.println("O resultado da Série é igual a "+serieDiv);

	}

}

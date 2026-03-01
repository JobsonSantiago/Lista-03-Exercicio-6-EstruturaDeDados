package view;

import javax.swing.JOptionPane;

import controller.Ex06Controller;

public class Ex06Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;

		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número:"));

		Ex06Controller ex = new Ex06Controller();
		System.out.println("Resultado: " + ex.calculaSerie(n));
	}

}

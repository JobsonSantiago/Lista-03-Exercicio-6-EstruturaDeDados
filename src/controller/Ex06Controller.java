package controller;

public class Ex06Controller {

	public Ex06Controller() {
		// TODO Auto-generated constructor stub
		super();
	}
	public double calculaSerie(int n) {
		// a condição de parada garante que quando n = 1, retorna 1
		if(n==1) {
			return 1.0;
		}
		// já a chamada de passos divide 1 pelo fatorial de n e soma-se com o resultado para n-1
		// que é passado para função novamente até ser = 1
		else {
			return 1.0/calcFat(n) + calculaSerie(n-1);
		}
	}
	public int calcFat(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n * calcFat(n-1);
		}
	}

}

package controller;

public class SerieDivisaoController {

	public SerieDivisaoController() {
		super();
	}
	
	public double serieDivisao(int num) {
	//condição de parada
		if (num == 0) {
			return 0;
		} else {
			// a função deve retornar a soma do resultado com a operação onde o dividendo é igual a 1 e o divisor igual ao número anterior.
			double resultado =  (1/(double) num);
			return resultado + serieDivisao(num - 1);
		}
	}
}
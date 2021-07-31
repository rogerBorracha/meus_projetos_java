package treinos;

import java.text.DecimalFormat;

public class treino_4_3 {

	//Faça um algoritmo que preencha um array com 10 valores reais (entre 0 e 100 e 
	//com duas casas decimais) gerados de maneira aleatória. Ao final exiba o maior 
	//valor que foi gerado e o índice em que ele se encontra no array.

	public static void main(String[] args) {
		double num[] = new double[10];
		double cont = 0;
		int indi = 0;
		for (int i = 0; i < 10; i++) {
			num[i] = (Math.random()*100);
			System.out.println(new DecimalFormat("#,##0.00").format(num[i])+" no indice "+i);
			if (num[i] > cont) {
				cont = num[i];
				indi = i;
			}
		}
		System.out.println("O maior numero gerado foi: "+ new DecimalFormat("#,##0.00").format(cont)+" no indice "+indi);
	}

}

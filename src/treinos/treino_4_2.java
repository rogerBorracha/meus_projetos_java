package treinos;

import java.util.Scanner;

public class treino_4_2 {

	//Construa um algoritmo que forneça um array com 10 valores inteiros fornecidos 
	//pelo usuário. Ao final exiba todos os valores desse array e a quantidade de 
	//numero que são pares ou divisíveis por 7.


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 10 numeros para preencher o array: ");
		int num[] = new int[10];
		int cont = 0;
		for (int i = 0; i < 10; i++) {
			num[i] = teclado.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Indice "+i+" - "+num[i]);
			if (num[i] % 2 == 0 || num[i] % 7 == 0) cont++;
		}
		System.out.println("O total de numeros pares ou divisiveis por 7 foi: "+cont);

	}

}

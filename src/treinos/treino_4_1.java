package treinos;

import java.util.Scanner;

public class treino_4_1 {

	//Crie um array de inteiros com 5 posições e preencha-os com dados através do 
	//usuário e imprima o array na tela. Ao final altere todos os valores pares do 
	//array por 3 (sem intervenção do usuário) e imprima novamente o array.


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 5 numeros para preencher o array: ");
		int num[] = new int[5];
		for (int i = 0; i < 5; i++) {
			num[i] = teclado.nextInt();
			System.out.println("Indice "+i+" - "+num[i]);
		}
		System.out.println(" ");
		for (int i = 0; i < 5; i++) {
			if (num[i] % 2 == 0) {
				num[i] = 3;
				System.out.println("Indice "+i+" - "+num[i]);
			}else {
				System.out.println("Indice "+i+" - "+num[i]);
			}
		}
	}
}
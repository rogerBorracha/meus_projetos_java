package treinos;

import java.util.Scanner;

public class treino_3_4 {

//	DESAFIO! Faça um algoritmo que recebe dois números positivos através do usuário e 
//	imprime todos os números primos que se encontram no intervalo entre os números 
//	digitados pelo usuário. Lembrando que números primos são aqueles que são 
//	divisíveis apenas por 1 ou por ele mesmo.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite dois numeros para descobrir os numeros primos em seu intervalo: ");
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		for (;num1 > num2; num2++) {
			boolean primo = true;
			for (int i = 2; i < num2; i++) {
			if (num2 % i == 0) {
				primo = false;
				break;
			}
			}if (primo) {
				System.out.println(num2);
			}
		}
		for (;num1 < num2; num1++) {
			boolean primo = true;
			for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				primo = false;
				break;
			}
			}if (primo) {
				System.out.println(num1);
			}
		}
	}
}
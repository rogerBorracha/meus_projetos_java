package treinos;

import java.util.Scanner;

public class treino_3_4 {

//	DESAFIO! Fa�a um algoritmo que recebe dois n�meros positivos atrav�s do usu�rio e 
//	imprime todos os n�meros primos que se encontram no intervalo entre os n�meros 
//	digitados pelo usu�rio. Lembrando que n�meros primos s�o aqueles que s�o 
//	divis�veis apenas por 1 ou por ele mesmo.

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
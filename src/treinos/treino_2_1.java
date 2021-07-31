package treinos;

import java.util.Scanner;

public class treino_2_1 {

	//Escreva um algoritmo que calcule a média dos números digitados pelo usuário, 
	//se eles forem pares. Termine a leitura se o usuário digitar zero (0).

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite numeros inteiros aleatoriamente, quando quiser finalizar digite 0: ");
		double num;
		double cont = 0;
		double cont2 = 0;
		do {
			num = teclado.nextDouble();
			if (num % 2 == 0 && num != 0) {
				cont += num;
				cont2++;
			}
		}while(num != 0);
		System.out.println("A media dos numeros pares é: " + (cont+=num)/cont2);
	}
}
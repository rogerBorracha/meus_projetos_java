package treinos;

import java.util.Scanner;

public class treino_3_2 {

//	Um número se diz perfeito se é igual à soma de seus divisores próprios. ... 
//	Por exemplo, o número 6, seus divisores próprios são 1, 2 e 3, cuja soma é igual 
//	à 6. 1 + 2 + 3 = 6. Outro exemplo é o número 28, cujos divisores próprios 
//	são 1, 2, 4, 7 e 14, e a soma dos seus divisores próprios é 28... 
//	Construa um programa que leia um número através do usuário e verifica se o 
//	número lido é perfeito ou não.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero pra ver se ele é perfeito: ");
		int num = teclado.nextInt();
		int cont = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.println(i);
				cont += i;
			}
		}
		if (cont == num) {
			System.out.println("O numero " + cont + " é perfeito: ");
		} else {
			System.out.println("O numero "+num+" não é perfeito");
		}
	}
}
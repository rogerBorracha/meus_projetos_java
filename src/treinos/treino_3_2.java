package treinos;

import java.util.Scanner;

public class treino_3_2 {

//	Um n�mero se diz perfeito se � igual � soma de seus divisores pr�prios. ... 
//	Por exemplo, o n�mero 6, seus divisores pr�prios s�o 1, 2 e 3, cuja soma � igual 
//	� 6. 1 + 2 + 3 = 6. Outro exemplo � o n�mero 28, cujos divisores pr�prios 
//	s�o 1, 2, 4, 7 e 14, e a soma dos seus divisores pr�prios � 28... 
//	Construa um programa que leia um n�mero atrav�s do usu�rio e verifica se o 
//	n�mero lido � perfeito ou n�o.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero pra ver se ele � perfeito: ");
		int num = teclado.nextInt();
		int cont = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.println(i);
				cont += i;
			}
		}
		if (cont == num) {
			System.out.println("O numero " + cont + " � perfeito: ");
		} else {
			System.out.println("O numero "+num+" n�o � perfeito");
		}
	}
}
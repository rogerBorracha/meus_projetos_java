package treinos;

import java.util.Scanner;

public class treino_1_4 {

//Faça um algoritmo que imprime todos os número pares 
//no intervalo entre 20 e 100 (inclusive).

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite 20");
		int num = teclado.nextInt();
		//int num = 20;
		while(num >= 20 && num <= 100) {
			System.out.println(num);
			num += 2;
		}
	}
}

package treinos;

import java.util.Scanner;

public class treino_2_4 {

	//Fa�a um algoritmo que leia 2 valores inteiros e positivos: X e Y. 
	//O algoritmo deve calcular e escrever a fun��o pot�ncia X Y

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("De um valor inteiro para o numero da base: ");
		int x = teclado.nextInt();
		System.out.println("De um valor inteiro para o numero do expoente: ");
		int y = teclado.nextInt();
		System.out.println("O resultado da potenci��o de base "+x+" com expoente "+y+" �: "+(int)Math.pow(x, y));
	}
}

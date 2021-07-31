package treinos;
import java.util.Scanner;

public class treino6 {

	//Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
	//Dica: utilize o operador módulo (resto da divisão).

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int num = teclado.nextInt();
		if (num % 2 != 0) {
			System.out.println("O numero digitado é impar: " +num);
		}else {
			System.out.println("O numero digitado é par: " +num);
		}
	}
}

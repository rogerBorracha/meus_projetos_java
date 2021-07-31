import java.util.Scanner;

public class aula6_1 {

	/*Faça um algoritmo que recebe um número inteiro através do usuário e imprime na 
	 * tela se o o número é positivo, negativo ou é zero.
	 */


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero inteiro:");
		int num = teclado.nextInt();
		if (num == 0) {
			System.out.println("O numero digitado foi zero: "+ num);
		}
		else if (num > 0) {
			System.out.println("O numero digitado foi positivo: "+ num);
		}
		else {
			System.out.println("O numero digitado foi negativo: "+ num);
		}		
	}
}

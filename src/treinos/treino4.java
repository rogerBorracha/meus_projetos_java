package treinos;
import java.util.Scanner;

public class treino4 {

	//Escreva um algoritmo que leia três números fornecidos pelo usuário e mostre sea 
	//soma de dois deles resulta no terceiro.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 3 numeros digerentes: ");
		double num1 = teclado.nextDouble();
		double num2 = teclado.nextDouble();
		double num3 = teclado.nextDouble();
		if (num1 + num2 == num3) {
			System.out.println("A soma do primeiro numero (" +num1+ ") com o segundo numero (" +num2+ ") é igual ao terceiro numero (" +num3+ ")");
		}else if (num1 + num3 == num2) {
			System.out.println("A soma do primeiro numero (" +num1+ ") com o terceiro numero (" +num3+ ") é igual ao segundo numero (" +num2+ ")");
		}else if (num2 + num3 == num1){
			System.out.println("A soma do segundo numero (" +num2+ ") com o terceiro numero (" +num3+ ") é igual ao primeiro numero (" +num1+ ")");
		}else {
			System.out.println("A soma de dois numeros não é igual ao total de nenhum deles");
		}
	}
}

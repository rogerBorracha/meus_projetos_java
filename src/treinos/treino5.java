package treinos;
import java.util.Scanner;

public class treino5 {

	//Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 2 numeros digerentes: ");
		double num1 = teclado.nextDouble();
		double num2 = teclado.nextDouble();
		if (num1 > num2) {
			System.out.println("O maior numero �: "+ num1);
		}else if (num1 < num2) {
			System.out.println("O maior numero �: "+ num2);
		}else {
			System.out.println("Os numeros s�o iguais: "+num1);
		}
		}

}

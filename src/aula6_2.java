import java.util.Scanner;

public class aula6_2 {

	//Fa�a um algoritmo que receba 3 n�meros (pelo usu�rio) e exiba eles na tela em 
	//ordem crescente.


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 3 numeros diferentes: ");
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		int num3 = teclado.nextInt();
		if (num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println("A ordem crescente �: "+ num3 + "," + num2 + "," + num1);
		}
		else if (num1 > num2 && num1 > num3 && num3 > num2) {
			System.out.println("A ordem crescente �: "+ num2 + "," + num3 + "," + num1);
		}
		else if (num1 < num2 && num1 > num3 && num3 < num2) {
			System.out.println("A ordem crescente �: "+ num3 + "," + num1 + "," + num2);
		}
		else if (num1 < num2 && num1 < num3 && num3 < num2) {
			System.out.println("A ordem crescente �: "+ num1 + "," + num3 + "," + num2);
		}
		else if (num1 < num2 && num1 < num3 && num3 > num2) {
			System.out.println("A ordem crescente �: "+ num1 + "," + num2 + "," + num3);
		}
		else if (num1 > num2 && num1 < num3 && num3 > num2) {
			System.out.println("A ordem crescente �: "+ num2 + "," + num1 + "," + num3);
		}
		else {
			System.out.println("Alguns numeros iguais, favor digitar numeros diferentes");
		}
	}

}

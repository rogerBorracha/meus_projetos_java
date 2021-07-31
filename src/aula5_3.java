import java.util.Scanner;

public class aula5_3 {	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite dois numeros inteiros diferentes");
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		if (num1 > num2) {
			System.out.println("O primeiro numero é maior: "+ num1);			
		}
		else if (num1 == num2) {
			System.out.println("Numeros iguais, digite numeros diferentes: "+ num1);			
		}
		else {
			System.out.println("O segundo numero é maior: "+ num2);			
		}
	}
}
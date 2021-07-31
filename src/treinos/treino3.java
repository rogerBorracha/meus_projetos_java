package treinos;
import java.util.Scanner;

public class treino3 {

	//Faça um Programa que leia três números e mostre o maior deles.

	public static void main(String[] args) {
	int num1 = 5;
	int num2 = 3;
	int num3 = 4;
	if (num1 > num2 && num1 > num3) {
		System.out.println("O maior numero é: "+ num1);
	}else if (num1 < num2 && num2 > num3) {
		System.out.println("O maior numero é: "+ num2);
	}else if (num1 < num3 && num2 < num3) {
		System.out.println("O maior numero é: "+ num3);
	}else {
		System.out.println("Os numeros são iguais: "+num1);
	}
	}
}

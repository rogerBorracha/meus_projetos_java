package treinos;
import java.util.Scanner;

public class treino3 {

	//Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.

	public static void main(String[] args) {
	int num1 = 5;
	int num2 = 3;
	int num3 = 4;
	if (num1 > num2 && num1 > num3) {
		System.out.println("O maior numero �: "+ num1);
	}else if (num1 < num2 && num2 > num3) {
		System.out.println("O maior numero �: "+ num2);
	}else if (num1 < num3 && num2 < num3) {
		System.out.println("O maior numero �: "+ num3);
	}else {
		System.out.println("Os numeros s�o iguais: "+num1);
	}
	}
}

package treinos;

import java.util.Scanner;

public class treino_1_2 {

//Fa�a um Programa que leia um n�mero e exiba o dia correspondente da semana. 
//(1-Domingo, 2- Segunda, 3- Ter�a ...), 
//se digitar outro valor deve aparecer valor inv�lido.
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero correspondente ao dia da semana: ");
		int dia = teclado.nextInt();
		if (dia == 1) {
			System.out.println("Numero digitado: "+dia+" - Domingo");
		}else if (dia == 2) {
			System.out.println("Numero digitado: "+dia+" - Segunda");
		}else if (dia == 3) {
			System.out.println("Numero digitado: "+dia+" - Ter�a");
		}else if (dia == 4) {
			System.out.println("Numero digitado: "+dia+" - Quarta");
		}else if (dia == 5) {
			System.out.println("Numero digitado: "+dia+" - Quinta");
		}else if (dia == 6) {
			System.out.println("Numero digitado: "+dia+" - Sexta");
		}else if (dia == 7) {
			System.out.println("Numero digitado: "+dia+" - Sabado");
		}else {
			System.out.println("Numero digitado invalido!!!: "+dia);
		}
	}

}

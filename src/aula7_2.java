import java.util.Scanner;

public class aula7_2 {

	//Construa um algoritmo que calcule o peso ideal de uma pessoa. 
	//Dados de entrada: altura e sexo. Fórmulas para cálculo do peso: 
	//peso ideal de homem = (72,7 x altura) - 58 - 
	//peso ideal da mulher = (62,1 x altura) - 44,7*

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua altura: ");
		double altura = teclado.nextDouble();
		System.out.println("Digite seu sexo, M ou F: ");
		char sexo = teclado.next().toUpperCase().charAt(0);
		switch (sexo) {
			case 'M':
				System.out.println("Seu peso ideal é: "+ ((72.7 * altura) - 58) );
				break;
			case 'F':
				System.out.println("Seu peso ideal é: "+ ((62.1 * altura) - 44.7) );
				break;
			default:
				System.out.println("Dados invalidos!!!");
		
		}

	}

}

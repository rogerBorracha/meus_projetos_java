package treinos;

import java.util.Scanner;

public class treino_1_3 {

	/*Escreva um algoritmo para ler o nome e a idade de uma pessoa, 
	 *e exibir quantos dias de vida ela possui. Considere sempre anos completos, 
	 *e que um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de vida;
	 *veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935DIAS*/
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ola, qual o seu nome? ");
		String nome = teclado.nextLine().toUpperCase();
		System.out.println("Quantos anos vc fara esse ano? ");
		int idade = teclado.nextInt();
		System.out.println(nome+ ", VOCÊ JÁ VIVEU: "+ 365*idade + " DIAS");

	}

}

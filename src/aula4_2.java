import java.util.Scanner;

public class aula4_2 {

	/*Faça um algoritmo que recebe 3 notas digitadas pelo usuário, ao final calcule e 
	 *imprima na tela a média das 3 notas.
	 *Scanner teclado = new Scanner(System.in); //criando o scanner
     *valor = teclado.nextInt(); // atribuindo valores
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 3 notas: ");
		int nota1 = teclado.nextInt();
		int nota2 = teclado.nextInt();
		int nota3 = teclado.nextInt();
		System.out.println("A média foi: "+ (nota1 + nota2 + nota3) / 3);
	}

}

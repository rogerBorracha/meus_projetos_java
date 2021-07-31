import java.util.Scanner;

public class aula5_2 {

/*Faça um algoritmo que receba a idade do usuário e verifique se ele tem 18 
 * anos ou mais. Se a resposta for positiva escrever “maior de idade”, 
 * senão “menor de idade”
*/

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a idade do usuário: ");
		int idade = teclado.nextInt();
		if (idade >= 18) {
			System.out.println("maior de idade");
		}
		else {
			System.out.println("menor de idade");
		}

	}

}

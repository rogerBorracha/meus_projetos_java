package treinos;
import java.util.Scanner;

public class treino6 {

	//Fa�a um Programa que pe�a um n�mero inteiro e determine se ele � par ou impar.
	//Dica: utilize o operador m�dulo (resto da divis�o).

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int num = teclado.nextInt();
		if (num % 2 != 0) {
			System.out.println("O numero digitado � impar: " +num);
		}else {
			System.out.println("O numero digitado � par: " +num);
		}
	}
}

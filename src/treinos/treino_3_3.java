package treinos;

import java.util.Scanner;

public class treino_3_3 {

//	Dado que o fatorial de um n�mero � ele multiplicado por todos os seus antecessores 
//	(5! = 5 X 4 X 3 X 2 X 1 = 120). Fa�a um algoritmo que recebe um n�mero digitado 
//	pelo usu�rio e imprime o fatorial desse n�mero.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero para calcular seu fatorial: ");
		int num = teclado.nextInt();
		int fat = 1;
		for(;num > 0; num--) {
			fat*=num;
			System.out.println(num+" -> "+fat);
		}
	}
}

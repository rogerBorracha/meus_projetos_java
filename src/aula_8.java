import java.util.Scanner;

public class aula_8 {

	//Fa�a um algoritmo que receba um n�mero pelo usu�rio e imprime na tela a tabuada
	//desse numero

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um numero para ver sua tabuada: ");
		int num = teclado.nextInt();
		int cont = 0;
		while (cont <= 10) {
			System.out.println(num +" X "+ cont + " = "+ num*cont);
			cont++;
		}

	}

}

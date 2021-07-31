import java.util.Scanner;

public class aula5_1 {


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 3 notas: ");
		double nota1 = teclado.nextDouble();
		double nota2 = teclado.nextDouble();
		double nota3 = teclado.nextDouble();
		if ((nota1 + nota2 + nota3)/3 >= 6) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");

		}
	}

}

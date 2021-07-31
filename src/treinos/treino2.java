package treinos;
import java.util.Scanner;

public class treino2 {

	//Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
	//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite um sexo F ou M: ");
	char sexo = teclado.nextLine().charAt(0);
	if (sexo == 'F' || sexo == 'f') {
		System.out.println("Digitou F - Feminino");
	}
	else if (sexo == 'M' || sexo == 'm') {
		System.out.println("Digitou M - Masculino");
	}
	else {
		System.out.println("Sexo invalido.... " + sexo);
	}
	}
}

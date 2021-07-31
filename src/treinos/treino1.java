package treinos;
import java.util.Scanner;

public class treino1 {

	//Escreva um algoritmo para ler um valor inteiro (do teclado) e escrever (na tela)
	//o seu antecessor.

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite um valor inteiro: ");
	int valor = teclado.nextInt();
	valor -= 1;
	System.out.println("O antecessor do valor digitado é: "+ valor);
	}

}

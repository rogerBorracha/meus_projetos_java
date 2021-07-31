import java.util.Scanner;

public class aula8_1 {

	//Faça um algoritmo que leia vários números inteiros e calcule o somatório dos 
	//números negativos. O fim da leitura será indicado pelo número 0.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite numeros aleatorios, quando quiser terminar clique 0: ");
		int num;
		int cont = 0;
		do {
			num = teclado.nextInt();
			if(num < 0) {
				cont += num;
			}
		}while (num != 0);
		System.out.println(cont+=num);
	}
}

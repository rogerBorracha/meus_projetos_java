import java.util.Scanner;

public class aula8_1 {

	//Fa�a um algoritmo que leia v�rios n�meros inteiros e calcule o somat�rio dos 
	//n�meros negativos. O fim da leitura ser� indicado pelo n�mero 0.

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

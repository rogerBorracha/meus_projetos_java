import java.util.Scanner;

public class aula11_2 {

	//Faça uma matriz quadrada, com tamanho definida pelo usuario. Preencha essa matriz
	//atraves do teclado. Imprima a matriz e tambem os valores da diagonal dela.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor quadratico da matriz: ");
		int quadrado = teclado.nextInt();
		int cont[] = new int [quadrado];
		int mat [][] = new int [quadrado][quadrado];
		
		for (int i = 0; i < mat.length; i++) {
			System.out.println("");
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = (int)(Math.random()*100);
				System.out.print(mat[i][j] + "\t");
				if (i == j) {
					cont[i] = mat[i][j]; 
				}
			}
		}
		System.out.println("\nValores da diagonal principal");
		for(int numeros : cont) {
			System.out.print(numeros +"\t");
		}
	}
}
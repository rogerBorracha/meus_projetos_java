package treinos;

public class treino5_3 {

	//Faça uma função que recebe, por parâmetro, uma matriz A(7,6) e retorna a soma 
	//dos elementos da linha 5 e da coluna 3. A imagem abaixo mostra como se retorna 
	//uma matriz e como declara no parâmetro.

	public static void main(String[] args) {
		int matriz [][] = new int [7][6];
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("");
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)(Math.random()*100);
				System.out.print(matriz[i][j] + "\t");
			}
		}
		int mostrarResultado[] = entrarnaMatrix(matriz);
		for (int mostrar : mostrarResultado) {
			System.out.println("\n" + mostrar);
		}
	}
	public static int[] entrarnaMatrix(int matrix[][]){
		int coluna = 0;
		int linha = 0;
		for (int i = 0; i < matrix.length; i++) {
			coluna += matrix[i][3];
		}
		int resultado[] = new int [2];
		resultado[0] = linha;
		resultado[1] = coluna;
		return resultado;
	}

}

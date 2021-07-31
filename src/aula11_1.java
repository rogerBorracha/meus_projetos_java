
public class aula11_1 {

//Para cada conjunto de valores abaixo, escreva o código Java, que preencha um array 
//com os valores: a)0 1 2 3 4 5 6 7 8 9
//					0 1 2 3 4 5 6 7 8 9
//					0 1 2 3 4 5 6 7 8 9

	public static void main(String[] args) {
		int matrix [][] = new int [3][10];
		for (int i = 0; i < matrix.length; i++) {
			System.out.println("");
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = j;
				System.out.print(matrix[i][j] + "\t");
			}

		}

	}

}

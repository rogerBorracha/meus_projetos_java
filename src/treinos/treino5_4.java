package treinos;

public class treino5_4 {

	//Faça um algoritmo que possua um metodo chamado "ordenaArray" que recebe um array
	//como parâmetro e retorna o array ordenado em ordem decrescente. Ao final, imprima 
	//no método main o array ordenado.

	public static void main(String[] args) {
		int num [] = new int [10] ;
		ordenarArray (num);
	}
	public static int[] ordenarArray (int ordem[]) {
		for (int i = 0; i < ordem.length; i++) {
			ordem[i] = (int)(Math.random()*100);
			System.out.print (ordem[i] + "\t");
		}
		for (int i = 0; i < ordem.length; i++) {
			for (int j = 0; j < ordem.length - 1; j++) {
				if (ordem[j] < ordem[j+1]) {
					int aux = ordem[j];
					ordem[j] = ordem[j+1];
					ordem[j+1] = aux;
				}
			}
		}
		System.out.print ("\n");
		for (int i = 0; i < ordem.length; i++) {
			System.out.print (ordem[i] + "\t");
		}
		return ordem;
	}

}

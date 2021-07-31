package treinos;

public class treino_4_4 {

	//Faça um programa que preencha um array com 20 números inteiros gerados de 
	//maneira aleatória, calcule e mostre os números primos e suas respectivas 
	//posições. Ao final construa um novo array resultante somente de números primos e 
	//exiba seus valores. Obs.: O tamanho do array resultante deve ser de acordo com a 
	//quantidade de números primos.

	public static void main(String[] args) {
		int num[] = new int[20];
		int cont = 0;
		boolean primo;
		for(int i = 0; i < 20; i++) {
			primo = true;
			num[i] = (int)(Math.random()*100);
			for(int j = 2; j < 20; j++) {
				if(num[i] % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				System.out.println("O numero "+num[i]+" é primo de indice "+i);
				cont++;
			}
		}
		int numNovo[] = new int[cont];
		int cont2 = 0;
		for (int i = 0; i < num.length; i++) {
			primo = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					primo = false;
					break; 
				}
				}if (primo) {
					numNovo[cont2] = num[i];
					cont2++;
			}		
		}
		for (int i = 0; i < numNovo.length; i++) {
			System.out.println("O " + numNovo[i] + " é número primo e ele está agora no índice: " + i);
		}
		System.out.println("A quantidade de primos foi: "+ cont);
	}
}
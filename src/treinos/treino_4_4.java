package treinos;

public class treino_4_4 {

	//Fa�a um programa que preencha um array com 20 n�meros inteiros gerados de 
	//maneira aleat�ria, calcule e mostre os n�meros primos e suas respectivas 
	//posi��es. Ao final construa um novo array resultante somente de n�meros primos e 
	//exiba seus valores. Obs.: O tamanho do array resultante deve ser de acordo com a 
	//quantidade de n�meros primos.

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
				System.out.println("O numero "+num[i]+" � primo de indice "+i);
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
			System.out.println("O " + numNovo[i] + " � n�mero primo e ele est� agora no �ndice: " + i);
		}
		System.out.println("A quantidade de primos foi: "+ cont);
	}
}
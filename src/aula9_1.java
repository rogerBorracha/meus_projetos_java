
public class aula9_1 {

	//Desenvolver um algoritmo que efetue a soma de todos os n�meros �mpares que s�o 
	//m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.

	public static void main(String[] args) {
		int cont = 0;
		for  (int i = 1 ;i < 500; i++) {
			if (i % 2 != 0 && i % 3 == 0) {
				cont += i;
			}
		}System.out.println(cont);
	}

}

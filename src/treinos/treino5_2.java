package treinos;

public class treino5_2 {

	//Escreva um m�todo que calcule e retorne o fatorial de um n�mero inteiro positivo.

	public static void main(String[] args) {
		System.out.println(fatorial(5));
	}
	public static int fatorial (int num) {
		int aux = 1;
		do {
			aux *= num;
			num = num - 2;
		}while(num > 1);
		return aux;
	}
}
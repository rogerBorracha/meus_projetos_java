package treinos;

public class treino5_1 {

	//Fa�a um programa com um m�todo que receba dois n�meros positivos por par�metro 
	//e retorne a soma dos N n�meros inteiros existentes entre eles. *

	public static void main(String[] args) {
		System.out.println(somatoria(9, 5));
	}
	public static int somatoria (int num1, int num2) {
		int aux = 0;
		if (num1 > num2) {
			aux = num2;
			num2 = num1;
			num1 = aux;
		}
		for (int i = num1; i <= num2; i++ ) {
			num1 = num1 + i;
			//System.out.println(i + " -> " + num1);
		}
		return num1;	
	}
}
package treinos;

public class treino_2_2 {

	//Escreva um algoritmo que gere o números de 1000 a 1999 e escreva aqueles que 
	//dividido por 11 dão resto igual a 5.


	public static void main(String[] args) {
		int num = 1000;
		while(num < 2000){
			if (num % 11 == 5) {
				System.out.println(num);
			}num++;
		}

	}

}
